package com.example.demo.util.fileToDB;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.StudentMapper;

@Component
@Controller
public class FileToStream {

	@Autowired
	StudentMapper stu;
	
	  // 读取本地图片获取输入流
   public static FileInputStream readImage(String path) throws IOException {
	 
	        return new FileInputStream(new File(path));
	    }
   
   public void FileToDb() throws IOException {
	   InputStream in=new FileInputStream(new File("D:\\test.rar"));
	   StudentEntity en=new StudentEntity();
	   en.setId(77);

       byte[] buffer=new byte[1024];
       int len=0;
       ByteArrayOutputStream bos=new ByteArrayOutputStream();
       while((len=in.read(buffer))!=-1){
           bos.write(buffer,0,len);
       }
       bos.flush();
       byte data[] = bos.toByteArray();
       en.setFile(data);
	   stu.insert(en);
	   
   }
   
   
   public void DbToFile() throws IOException {
	   StudentEntity en=stu.getOne(77);
	   byte[] bytes=en.getFile();
	   ByteArrayInputStream inputStream=new ByteArrayInputStream(bytes);
		//将二进制字节数组 转为文件
       Files.copy(inputStream, Paths.get("D:\\test2.rar"));

	   
   }

   
   @RequestMapping("/DbToFile2")
   public String DbToFile2(HttpServletRequest request, HttpServletResponse response) throws IOException {
       // 将文件写入输入流
   //    FileInputStream fileInputStream = new FileInputStream(file);
	   StudentEntity en=stu.getOne(77);
	   byte[] bytes=en.getFile();
	   ByteArrayInputStream inputStream=new ByteArrayInputStream(bytes);
       InputStream fis = new BufferedInputStream(inputStream);
       byte[] buffer = new byte[fis.available()];
       fis.read(buffer);
       fis.close();

       // 清空response
       response.reset();
       // 设置response的Header
       response.setCharacterEncoding("UTF-8");
       //Content-Disposition的作用：告知浏览器以何种方式显示响应返回的文件，用浏览器打开还是以附件的形式下载到本地保存
       //attachment表示以附件方式下载   inline表示在线打开   "Content-Disposition: inline; filename=文件名.mp3"
       // filename表示文件的默认名称，因为网络传输只支持URL编码的相关支付，因此需要将文件名URL编码后进行传输,前端收到后需要反编码才能获取到真正的名称
       response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("server.xml", "UTF-8"));
       // 告知浏览器文件的大小
   //    response.addHeader("Content-Length", "" + file.length());
       OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
       response.setContentType("application/octet-stream");
       outputStream.write(buffer);
       outputStream.flush();
       outputStream.close();
       return "index";
	   
   }
}
