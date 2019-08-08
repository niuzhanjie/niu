package com.example.demo.util.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
			test02();
		
	}

	   /**
	    * 读取控制台中的输入，只有一次输入就结束
	    * @throws IOException
	    */
	   public static void test01() throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("请输入一个字符");
	        char c;
	        c = (char) bufferedReader.read();
	        System.out.println("你输入的字符为"+c);
	    }
	   
	   /**
	    * 读取控制台中的输入，无数次，输入exit退出
	    * @throws IOException
	    */
	   public static void test02() throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("请输入一个字符，按 q 键结束");
//	        char c;
//	        c = (char) bufferedReader.read();
	        String str = "";

	        while(!str.equals("exit")) {
	        	str = bufferedReader.readLine();
	        	System.out.println("你输入的字符为"+str);
	        }
	        bufferedReader.close();
//	        do {
//	            c = (char) bufferedReader.read();
//	            System.out.println("你输入的字符为"+c);
//	        } while (c != 'q');
	    }

	   /**
	    * 读取一行
	    * @throws IOException
	    */
	    public static void test03() throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("请输入一行字符");
	        String str = bufferedReader.readLine();
	        System.out.println("你输入的字符为" + str);
	    }

}
