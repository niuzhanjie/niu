package com.example.demo.util;

import java.util.List;

public class TestEntity {

	private String name;
	private List<String> ids;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getIds() {
		return ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	@Override
	public String toString() {
		return "TestEntity [name=" + name + ", ids=" + ids + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())			
			return false;
		TestEntity other = (TestEntity) obj;
		
		 if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}
