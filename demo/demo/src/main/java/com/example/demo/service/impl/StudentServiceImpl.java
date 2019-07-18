package com.example.demo.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<StudentEntity> getAll(StudentEntity studentEntity) {
		List<StudentEntity> list=studentMapper.getAll(studentEntity);
		
		return list;
	}

	@Override
	public int update(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		return studentMapper.update(studentEntity);
	}

	@Override
	public StudentEntity getOne(int id) {
		// TODO Auto-generated method stub
		return studentMapper.getOne(id);
	}

	@Transactional(readOnly = false, rollbackFor = Exception.class)
	@Override
	public boolean batchImport(String fileName, MultipartFile file) throws Exception {
		boolean notNull = false;
		List<StudentEntity> stuList = new ArrayList<StudentEntity>();
		if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
			throw new Exception("上传文件格式不正确");
		}
		boolean isExcel2003 = true;
		if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
			isExcel2003 = false;
		}
		InputStream is = file.getInputStream();
		Workbook wb = null;
		if (isExcel2003) {
			wb = new HSSFWorkbook(is);
		} else {
			wb = new XSSFWorkbook(is);
		}
		Sheet sheet = wb.getSheetAt(0);
		if (sheet != null) {
			notNull = true;
		}
		StudentEntity stu;
		for (int r = 1; r <= sheet.getLastRowNum(); r++) {
			Row row = sheet.getRow(r);
			if (row == null) {
				continue;
			}
			stu = new StudentEntity();
//			if (row.getCell(0).getCellType() != 1) {
//				throw new Exception("导入失败(第" + (r + 1) + "行,姓名请设为文本格式)");
//			}
//			String name = row.getCell(0).getStringCellValue();
//			if (name == null || name.isEmpty()) {
//				throw new Exception("导入失败(第" + (r + 1) + "行,姓名未填写)");
//			}
//			row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
//			String phone = row.getCell(1).getStringCellValue();
//			if (phone == null || phone.isEmpty()) {
//				throw new Exception("导入失败(第" + (r + 1) + "行,电话未填写)");
//			}
//			String add = row.getCell(2).getStringCellValue();
//			if (add == null) {
//				throw new Exception("导入失败(第" + (r + 1) + "行,不存在此单位或单位未填写)");
//			}
//			Date date;
//			if (row.getCell(3).getCellType() != 0) {
//				throw new Exception("导入失败(第" + (r + 1) + "行,入职日期格式不正确或未填写)");
//			} else {
//				date = row.getCell(3).getDateCellValue();
//			}
			row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
			row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
			row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
			row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
			String ids = row.getCell(0).getStringCellValue();
			int id=Integer.parseInt(ids);
			String name = row.getCell(1).getStringCellValue();
			String sex = row.getCell(2).getStringCellValue();
			String ages = row.getCell(3).getStringCellValue();
			stu.setId(id);
			stu.setName(name);
			stu.setSex(sex);
			stu.setAges(ages);			
			stuList.add(stu);
		}
		for (StudentEntity student : stuList) {					
			studentMapper.insert(student);
				System.out.println(" 插入 " + student.getName());
			
		}
		return notNull;
	}
	
	
	
}
