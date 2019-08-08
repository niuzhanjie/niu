package com.example.demo.util.reflect;

import java.lang.reflect.Field;

public class TestReflect {

	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.example.demo.util.reflect.Student");
		//1.获取所有字段(共有的字段,public修饰的)
		Field[] fieldArray=clazz.getFields();
		for (Field field : fieldArray) {
			System.out.println(field);
		}
		
		//2.获取所有字段(包括public,private,protect,default)
		Field[] fieldArray2=clazz.getDeclaredFields();
		for (Field field : fieldArray2) {
			System.out.println(field);
		}
		
		//3.获取单个字段（public修饰的），并且调用
		Field field=clazz.getField("id");//获取变量id
		Object obj=clazz.getConstructor().newInstance();//创建对象，相当于Student obj=new Student();
		field.set(obj, "66");//给变量id赋值
		//验证是否赋值
		Student stu=(Student) obj;
		System.out.println(stu.id);
		
		//4.获取单个字段，能获取所有修饰符修饰的
		Field field2=clazz.getDeclaredField("name");//获取私有变量name
		field2.setAccessible(true);//暴力反射，解除私有限定
		field2.set(obj, "小缘");//赋值
		System.out.println(stu.getName());//输出
		
	}
}
