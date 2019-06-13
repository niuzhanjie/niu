package com.example.demo.util;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
/**
 * json转换
 * @author 守候
 *
 */
public class JsonToString {

	public static void main(String[] args) {
	
		 String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}";  	 
		 jsonToMap1(str);
		 
	}
	
	
	
	/**
	 * 这个是用JSON类来解析JSON字符串!!!
	 * @param str
	 */
	public static void jsonToMap1(String str){
		//方法一
		//这个是用JSON类来解析JSON字符串!!!		
		 Map maps = (Map)JSON.parse(str); 
		 for(Object map:maps.entrySet()) {
			 System.out.println(((Map.Entry)map).getKey()+"     " + ((Map.Entry)map).getValue());  
		 }
	}
	
	/**
	 * 这个是用JSON类的parseObject来解析JSON字符串!!!
	 * @param str
	 */
	public static void jsonToMap2(String str){
		
		Map mapTypes = JSON.parseObject(str);
		for (Object obj : mapTypes.keySet()) {
			System.out.println("key为：" + obj + "值为：" + mapTypes.get(obj));
		}
	}
	/**
	 * 这个是用JSON类来解析JSON字符串!!!
	 * @param str
	 */
	public static void jsonToMap3(String str){
		         //第三种方式  
		         Map mapType = JSON.parseObject(str,Map.class);  
	         System.out.println("这个是用JSON类,指定解析类型，来解析JSON字符串!!!");  
		        for (Object obj : mapType.keySet()){  
		             System.out.println("key为："+obj+"值为："+mapType.get(obj));  
		        }  
	}
	/**
	 * 这个是用JSON类来解析JSON字符串!!!
	 * @param str
	 */
	public static void jsonToMap4(String str){
		 Map json = (Map) JSONObject.parse(str);  
		         System.out.println("这个是用JSONObject类的parse方法来解析JSON字符串!!!");  
		          for (Object map : json.entrySet()){  
		              System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());  
		          } 
	}
	/**
	 * 这个是用JSON类来解析JSON字符串!!!
	 * @param str
	 */
	public static void jsonToMap5(String str){
		  JSONObject jsonObject = JSONObject.parseObject(str);  
		           System.out.println("这个是用JSONObject的parseObject方法来解析JSON字符串!!!");  
		          for (Object map : jsonObject.entrySet()){  
		               System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());  
		           } 
	}
	/**
	 * 这个是用JSON类来解析JSON字符串!!!
	 * @param str
	 */
	public static void jsonToMap6(String str){
		 Map mapObj = JSONObject.parseObject(str,Map.class);  
		          System.out.println("这个是用JSONObject的parseObject方法并执行返回类型来解析JSON字符串!!!");  
		         for (Object map: mapObj.entrySet()){  
		             System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());  
		         }  
		         String strArr = "{{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}," +  
		                 "{\"00\":\"zhangsan\",\"11\":\"lisi\",\"22\":\"wangwu\",\"33\":\"maliu\"}}";  
		         // JSONArray.parse()  
		         System.out.println(mapObj);  
		     }
	
	
	
	
	
}
