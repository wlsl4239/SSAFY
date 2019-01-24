package com.ssafy.product;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;

public class ProductServer {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(8888);
			
			while(true) {
				System.out.println("서버 시작");
				System.out.println("접속 대기중");
				
				Socket socket = server.accept();
				
				System.out.println("접속 되었습니다.");
				
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				try {
					Collection<Product> list = (Collection<Product>)ois.readObject();
					
					for (Product product : list) {
						System.out.println(product);
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
