package test.com.ssafy;

import com.ssafy.UserManager;
import com.ssafy.UserService;

public class UserTest {
	public static void main(String[] args) {
		String s = new String("hi");

		//다형성
//		User u1 = new StudentUser();
//		u1 = new TeacherUser();
		
		//IoC(inversion of control, 역제어)
		UserService us = UserManager.getUserService();
		System.out.println(us.getName());
		UserService us2 = UserManager.getUserService();
		System.out.println(us2.getName());
		us2 = UserManager.getUserService();
		System.out.println(us2.getName());
		
		
		
		System.out.println("end");
	}
}
