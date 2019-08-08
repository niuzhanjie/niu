package com.example.demo.util.socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket serverSocket=null;
	private Socket socket=null;
	private DataInputStream input=null;
	
	public Server(int port) {
		System.out.println("bind port...");
		try {
			serverSocket=new ServerSocket(port);//绑定端口
			System.out.println("Server started and waiting a client");
			socket=serverSocket.accept();//调用accept()方法，提取连接请求
			//一般是以字节传输
			input=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			String line="";
			while(!line.equals("exit")) {
				//readUTF()方法需要读取writeUTF()写过来的数据
				line=input.readUTF();
				System.out.println("rwcd"+line);
				
			}
		
		System.out.println("connection closed...");
		input.close();
		socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
	}
	
	 public static void main(String[] args) {
	        Server server = new Server(5000);
	    }
	
	
	
	
	
}
