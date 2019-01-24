package com.ssafy.book;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;

public class BookServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);
			
			while(true) {
				System.out.println("서버 대기중......");
				
				Socket socket = server.accept();
				
				System.out.println("서버 접속됨");
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				
				try {
					Collection<Book> list = (Collection<Book>)ois.readObject();
					
					for (Book book : list) {
						System.out.println(book);
					}
				} catch (Exception e) {
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
