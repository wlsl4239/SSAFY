package com.ssafy.com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.ssafy.customer.UserObject;

public class SimpleClient {
	public SimpleClient() {
		
		//2. ip, port#으로 접속시도.
		try {
			Socket socket = new Socket("70.12.108.219",8888);
			
//			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//			System.out.println(ois.readObject());
			
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(new UserObject("홍길동",100));
			oos.flush();
			oos.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SimpleClient();
	}
}
