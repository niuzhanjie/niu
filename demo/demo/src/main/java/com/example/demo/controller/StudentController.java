package com.example.demo.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.log.LoggerInfo;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.StudentEntity;
import com.example.demo.entity.StudentEnum;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	private StudentService service;

	/**
	 * 主页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model) {
	
		return "index";

	}
	
	/**
	 * 主页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/yangShuaiBi")
	@LoggerInfo(value = "play页面访问")
	public String indexpley(Model model) {
	
		return "play/index";

	}
	
	/**
	 * 主页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/dream")
	public String index2(Model model) {
	
		return "play/index";

	}
	
	@RequestMapping("/getStudent")
	@ResponseBody
	@LoggerInfo(value = "学生接口")
	public List<StudentEntity> getUsers(StudentEntity studentEntity) {
	
		List<StudentEntity> stuList=service.getAll(studentEntity);

		return stuList;

	}
	
	
	
	
	@RequestMapping("/getOneStudent")
	public String getOneStudent(int id,Model model) {
		StudentEntity studentEntity=service.getOne(id);
		model.addAttribute("studentEntity",studentEntity);
		return "updateStudent";
		
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(StudentEntity studentEntity) {
		int number=service.update(studentEntity);
		if(number>0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");

		}
		return "index";
		
	}

	
	@RequestMapping("/importExcel")
    @ResponseBody  
	public boolean addUser(@RequestParam("file") MultipartFile file) {
		boolean a = false;
		String fileName = file.getOriginalFilename();
		try {
			a = service.batchImport(fileName, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	
	
	
	@RequestMapping("/uploadIndex")
	public String upload(Model model) {

		return "upload";

	}
	
	@RequestMapping("/tabIndex")
	public String tabIndex(Model model) {

		return "tabdemo";

	}
	
	/**
	 * 上传文件
	 */
	 private static String UPLOADED_FOLDER = "E://temp//";
	 @RequestMapping("/upload") 
	public String singleFileUpload(@RequestParam("file") MultipartFile file,
	                               RedirectAttributes redirectAttributes,Model model) {
	    if (file.isEmpty()) {
	        redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	        return "redirect:uploadStatus";
	    }

	    try {
	        // Get the file and save it somewhere
	        byte[] bytes = file.getBytes();
	        Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	        Files.write(path, bytes);

	        redirectAttributes.addFlashAttribute("message",
	                "You successfully uploaded '" + file.getOriginalFilename() + "'");

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	 //   List<StudentEntity> student=studentMapper.getAll();
		//model.addAttribute("student", student);
	    return "index";
	}
	 
	 /**
	    * 下载导入模板
	 * @throws Exception
	 */
	 @RequestMapping(value = "/downloadExcel")
	 @ResponseBody
	 public void downloadExcel(HttpServletResponse res, HttpServletRequest req) throws Exception {
	   String fileName = "test.xlsx";
	 ServletOutputStream out;
	 res.setContentType("multipart/form-data");
	 res.setCharacterEncoding("UTF-8");
	 res.setContentType("text/html");
	 String filePath = getClass().getResource("/model/" + fileName).getPath();
	 String userAgent = req.getHeader("User-Agent");
	 if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
	 fileName = java.net.URLEncoder.encode(fileName, "UTF-8");
	 } else {
		 // 非IE浏览器的处理：
		 fileName = new String((fileName).getBytes("UTF-8"), "ISO-8859-1");
	 }
	 filePath = URLDecoder.decode(filePath, "UTF-8");
	 res.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
	 FileInputStream inputStream = new FileInputStream(filePath);
	 out = res.getOutputStream();
	 int b = 0;
	 byte[] buffer = new byte[1024];
	 while ((b = inputStream.read(buffer)) != -1) {
	 // 4.写到输出流(out)中
	 out.write(buffer, 0, b);
	 }
	 inputStream.close();
	 if (out != null) {
	 out.flush();
	 out.close();
	 }
	 }
	
	 @RequestMapping(value = "/exportExcel")
	 @ResponseBody
	 public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
		 try {
		 HSSFWorkbook wb = new HSSFWorkbook();
		 // 根据页面index 获取sheet页
		 HSSFSheet sheet = wb.createSheet("人员基本信息");
		//创建表头
         setTitle(wb, sheet);
         StudentEntity stu=new StudentEntity();
         List<StudentEntity> stuList=service.getAll(stu);
         int i=1;
         for (StudentEntity stu2 : stuList) {
			
			// 创建HSSFRow对象
			HSSFRow row = sheet.createRow(i);
			 row.createCell(0).setCellValue(stu2.getId());
			 row.createCell(1).setCellValue(stu2.getName());
			 row.createCell(2).setCellValue(stu2.getSex());
			 row.createCell(3).setCellValue(stu2.getAges());
			 i++;
		}	
		 // 输出Excel文件
		 OutputStream output = response.getOutputStream();
		 response.reset();
		 // 设置文件头
		 response.setHeader("Content-Disposition",
		 "attchement;filename=" + new String("人员信息.xls".getBytes("gb2312"), "ISO8859-1"));
		 response.setContentType("application/msexcel");
		 wb.write(output);
		 wb.close();
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		 }
	 
	 
	 
	 
	 
	 
	   // 创建表头
	    private static void setTitle(HSSFWorkbook workbook, HSSFSheet sheet) {
	        HSSFRow row = sheet.createRow(0);
	        // 设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
	        sheet.setColumnWidth(8, 60 * 256);
	        // 设置为居中加粗
	        HSSFCellStyle style = workbook.createCellStyle();
	        HSSFFont font = workbook.createFont();
	        font.setBold(true);
	        style.setFont(font);
	        //导出的Excel头部
	        String[] headers = { "编号", "姓名", "性别","年龄",
	                };
	        // 设置表格默认列宽度为15个字节
	        sheet.setDefaultColumnWidth((int) 16);
	        for (int i = 0; i < headers.length; i++) {
	            HSSFCell cell = row.createCell(i);
	            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
	            cell.setCellValue(text);
	            cell.setCellStyle(style);
	        }
	    }
	    
	    
	    
	    @RequestMapping(value = "/exportExcel2")
		 @ResponseBody
		 public void exportExcel2(HttpServletRequest request, HttpServletResponse response,StudentEntity stu) {
			
	         List<StudentEntity> stuList=service.getAll(stu);
	//       ImportExcelUtil.exportInfos(stuList, "学生信息", StudentEnum.class, StudentEntity.class, request, response);
			 
	    
	    }
	    
}
