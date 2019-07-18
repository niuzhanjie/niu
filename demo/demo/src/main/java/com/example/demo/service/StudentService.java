package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.StudentEntity;

@Service
public interface StudentService {

	List<StudentEntity> getAll(StudentEntity studentEntity);
	
	int update(StudentEntity studentEntity);
	
	StudentEntity getOne(int id);

	boolean batchImport(String fileName, MultipartFile file) throws Exception;
}
