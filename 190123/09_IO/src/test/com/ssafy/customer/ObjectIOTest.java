package test.com.ssafy.customer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ssafy.customer.UserObject;

public class ObjectIOTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//객체를 그대로 전달, 받기
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"));

//		oos.writeObject(new UserObject("홍길동",50));		//commit
//		oos.writeObject(new UserObject("이순신",20));		//commit
//		oos.writeObject(new UserObject("세종대왕",30));	//commit
//		oos.flush();									//push
//		oos.close();									//flush + 종료


		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));

		try {
			while(true) {
				UserObject u1 = (UserObject)ois.readObject();
				System.out.println(u1);
			}
		}catch(EOFException e) {
			e.printStackTrace();
		}

		System.out.println("END");
	}
}
