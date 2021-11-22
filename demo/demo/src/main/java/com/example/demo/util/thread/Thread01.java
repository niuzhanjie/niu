package com.example.demo.util.thread;

public class Thread01 implements Runnable{

	private String name;
	
	public  Thread01(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println(name+"好");
	}

	public static void main(String[] args) {
		new Thread(new Thread01("老师")).start();
	}
}
