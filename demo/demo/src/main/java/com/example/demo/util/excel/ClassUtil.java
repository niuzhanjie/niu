package com.example.demo.util.excel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassUtil {

	public static final String METHODTYPE_SET="set";
	public static final String METHODTYPE_GET="get";
	
	public static Method getMethod(String methodType,String propertyName,Class<?> clazz) {
		Method md = null;
		propertyName=propertyName.substring(0,1).toUpperCase()+propertyName.substring(1);
		try {
			md=clazz.getMethod(methodType+propertyName,new Class[0]);
			return md;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	@SuppressWarnings("rawtypes")
	public static String getValueFormEntity(String key,Object obj, Class clazz) {
		String s=null;
		try {
			Object ob=ClassUtil.getMethod(METHODTYPE_GET, key, obj.getClass()).invoke(obj);
			if(ob!=null) {
				s=String.valueOf(ob);
			}else {
				s="";
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return s;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
