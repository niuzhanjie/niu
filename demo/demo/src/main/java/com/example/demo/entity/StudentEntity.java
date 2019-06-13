package com.example.demo.entity;

import java.util.Date;

public class StudentEntity {

	private int id;
	private String name;
	private String sex;
	private int ages;
	private String date2;

	private ScoreEntity score;

	public ScoreEntity getScore() {
		return score;
	}
	public void setScore(ScoreEntity score) {
		this.score = score;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAges() {
		return ages;
	}
	public void setAges(int ages) {
		this.ages = ages;
	}
	
	
	
}
