package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<StudentEntity> getAll() {
		List<StudentEntity> list=studentMapper.getAll();
		
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
	
	
	
}
