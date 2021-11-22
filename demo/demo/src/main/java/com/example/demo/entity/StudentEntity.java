package com.example.demo.entity;

import java.sql.Blob;
import java.util.Date;

public class StudentEntity {

	private int id;
	private String name;
	private String sex;
	private String ages;
	private String date;
	private byte[] file;
	private ScoreEntity score;

	public ScoreEntity getScore() {
		return score;
	}

	public void setScore(ScoreEntity score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}




	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
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

	public String getAges() {
		return ages;
	}

	public void setAges(String ages) {
		this.ages = ages;
	}

}
