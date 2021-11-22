package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		List<String> list=new ArrayList<String>();
		list.add("123abccd");
		list.add("abcdc123");
		list.add("1234abc");
		list.add("ab1234cd");
		for(int i=0;i<list.size()-1;i++) {
			for(int j=list.size()-1;j>i;j--) {
				String str=list.get(i).replaceAll("[a-zA-Z]","");
				String str2=list.get(j).replaceAll("[a-zA-Z]","");
				if(str.equals(str2)) {
					list.remove(j);
				}
			}
		}
		
		
		System.out.print(list);
	}
	
	public void test2() {
		String a="abc123sd";
		String regex1="[a-zA-Z]";
		String shuzi=a.replaceAll(regex1,"");
		System.out.print(shuzi);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
