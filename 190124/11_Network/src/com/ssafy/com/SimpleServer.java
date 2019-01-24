package com.ssafy.com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.ssafy.customer.UserObject;

public class SimpleServer {
	public SimpleServer() {
		//1. 서버 구동
		try {
			ServerSocket server = new ServerSocket(8888);
			while(true) {
				System.out.println("서버 대기중...");
				
				Socket socket = server.accept();	//3. 사용자 접속.
				System.out.println("3. 사용자가 접속했습니다." + socket.getInetAddress());		
				
				// server --> client 환영메세지
//				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//				oos.writeObject("호갱님 환영합니다.(Server -> Client)");
//				oos.flush();
				
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				
				try {
					UserObject uo = (UserObject)ois.readObject();
					System.out.println(uo);
				} catch (Exception e) {	//이부분에서 예외발생해도 서버는 정상 작동해야함.
					e.printStackTrace();
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SimpleServer();
		
	}
}
