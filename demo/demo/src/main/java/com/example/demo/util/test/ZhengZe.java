package com.example.demo.util.test;

import java.util.regex.Pattern;

public class ZhengZe {

	public static void main(String[] args) {
		String str="11223";
		String regex="\\d+";
		boolean result=str.matches(regex);
		boolean matches=Pattern.matches(regex, str);
		System.out.println(matches+"***");
		System.out.println(result);
	}
	
}
