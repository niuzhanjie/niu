package com.example.demo.util.reflect;

import java.lang.reflect.Method;

public class TestReflectMethod {

	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.example.demo.util.reflect.Student");
		
		//获取所有公共方法
		Method[] m=clazz.getMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		
		//获取共有方法：show1，传入参数类型为String
		Method m2=clazz.getMethod("show1",String.class);
		Object obj=clazz.getConstructor().newInstance();//new 对象
		m2.invoke(obj, "aa");
		
		//获取所有方法，包括私有的
		Method m3[]=clazz.getDeclaredMethods();
		for (Method method : m3) {
			System.out.println(method);
		}
		
		//获取私有方法
		Method m4=clazz.getDeclaredMethod("show4",int.class);
		m4.setAccessible(true);//暴力解除私有，不然会报错
		m4.invoke(obj, 4);
	}
}
