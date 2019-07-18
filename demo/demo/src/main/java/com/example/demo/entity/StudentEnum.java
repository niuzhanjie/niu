package com.example.demo.entity;
/**
 * 枚举（导出excel时用）
 * @author 守候
 *
 */
public enum StudentEnum {
	
	
	ID("编号","Id"),
	NAME("姓名","Name"),
	SEX("性别","Sex"),
	AGES("年龄","Ages");
	
	private String key;
	private String value;
	
	StudentEnum(String key,String value){
		this.key=key;
		this.value=value;
	}
/**
 * 获取常量
 * @return
 */
	public static String[] getKeyConstants() {
		StringBuffer sb=new StringBuffer();
		for(StudentEnum se:StudentEnum.values()) {
			sb.append(","+se.getKey());
		}
		return sb.toString().substring(1).split(",");
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
