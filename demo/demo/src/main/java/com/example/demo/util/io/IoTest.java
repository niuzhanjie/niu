package com.example.demo.util.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IoTest {
	public static void main(String[] args) {
		String fileName="D:\\test.txt";
		readFileByManyChars(fileName);
	}

	/**
	 * 以字节为单位读取文件，常用于读二进制文件，如图片，声音，影像等文件
	 * 一次读取一个字节
	 */
	public static void readFileByBytes(String fileName) {
		File file=new File(fileName);
		InputStream in=null;//字节流
		BufferedWriter bw = null;
		BufferedReader bin=null;
		try {
			in=new FileInputStream(file);
			 bin= new BufferedReader(new InputStreamReader(in));//字节转为字符
			bw = new BufferedWriter(new FileWriter("D:\\a.txt"));
			
			String tempbyte;
			while((tempbyte=bin.readLine())!=null) {
				bw.write(tempbyte);//将数据写入文件
				bw.newLine();//写入新的一行
				bw.flush();//刷新数据缓冲
				System.out.println(tempbyte);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 多字节读取
	 */
	public static void fileByMoreBytes(String fileName) {
		InputStream in=null;		
		try {
			in=new FileInputStream(fileName);
			byte[] temptypes=new byte[1024];//每次读取1024个字节
			int b=0;
			while((b=in.read(temptypes))!=-1) {
				
				System.out.write(temptypes, 0, b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}					
	}
	
	/**
	 * 以字符单位读取文件，常用于读文本，数字等类型文件
	 * 一次读取一个字节
	 */
	public static void readFileByChars(String fileName) {
		File file=new File(fileName);
		Reader reader=null;
		
		try {
			reader=new InputStreamReader(new FileInputStream(file));
			int tempchar;
			while((tempchar=reader.read())!=-1) {
				if(((char)tempchar)!='\r') {
					System.out.print((char)tempchar);
				}
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 一次读取多个字符
	 */
	public static void readFileByManyChars(String fileName) {
		File file=new File(fileName);
		Reader reader=null;
		
		try {
			reader=new InputStreamReader(new FileInputStream(file));
			char [] tempchars=new char[30];
			int charread=0;
			while((charread=reader.read(tempchars))!=-1) {
				if((charread==tempchars.length)&& (tempchars[tempchars.length-1]!='\r')) {
					System.out.print(tempchars);
				}else {
					for(int i=0;i<charread;i++) {
						if(tempchars[i]=='\r') {
							continue;
						}else {
							System.out.print(tempchars[i]);
						}
					}
				}
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
