package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	private StudentService service;

	

	@RequestMapping("/getStudent")
	public String getUsers(Model model) {
	
		List<StudentEntity> student=service.getAll();
		for(StudentEntity s:student) {
			System.out.println(s.getScore().getGrade());
		}
		
		
		model.addAttribute("student", student);
		return "index";

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
	
	
	@RequestMapping("/uploadIndex")
	public String upload(Model model) {

		return "upload";

	}
	
	@RequestMapping("/tabIndex")
	public String tabIndex(Model model) {

		return "tabdemo";

	}
	
	
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
}
