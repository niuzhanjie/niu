package com.example.demo.util;

public class Student {

	private String name;
	private Integer   score;
	private Integer   height;
	private String college;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer  getScore() {
		return score;
	}
	public void setScore(Integer  score) {
		this.score = score;
	}
	public Integer  getHeight() {
		return height;
	}
	public void setHeight(Integer  height) {
		this.height = height;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String name, Integer  score, Integer  height, String college, String address) {
		super();
		this.name = name;
		this.score = score;
		this.height = height;
		this.college = college;
		this.address = address;
	}
	
	
}
