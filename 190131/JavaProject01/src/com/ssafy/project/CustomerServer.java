package com.ssafy.project;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;

public class CustomerServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);
			
			while(true) {
				Socket socket = server.accept();
				
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				Customer temp = (Customer)ois.readObject();
				
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("userDataLog.txt",true));
				dos.writeBytes("["+socket.getInetAddress()+"] "+temp+'\n');
				dos.flush();
				dos.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
