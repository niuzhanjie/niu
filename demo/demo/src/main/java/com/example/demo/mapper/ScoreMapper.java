package com.example.demo.mapper;

import java.util.List;


import org.springframework.stereotype.Component;

import com.example.demo.entity.ScoreEntity;

@Component
public interface ScoreMapper {

	List<ScoreEntity> getAll();
	


	
}
