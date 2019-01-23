package test.com.ssafy.customer;

import java.util.Scanner;

import com.ssafy.customer.NameLengthException;
import com.ssafy.customer.PointValueException;
import com.ssafy.customer.UserImpl;
import com.ssafy.customer.UserObject;

public class UserUI {
	private Scanner sc = new Scanner(System.in);
	private UserImpl ui = new UserImpl();
	
	public UserUI() {
		startUI();
	}
	
	private void startUI() {
		
		while(true) {
			String query;
			
			System.out.println("1. 고객추가\r\n" + 
					"2. 고객목록\r\n" + 
					"3. 저장 후 종료\r\n" + 
					"");
			System.out.print("입력 : ");
			query = sc.nextLine();
			
			switch(query) {
			case "1":
				addUser();
				break;
			case "2":
				getUserList();
				break;
			case "3":
				close();
				break;
				
			}
		}		
	}

	private String getText(String s) {
		System.out.print(s);
		return sc.nextLine();
	}
	private void close() {
		ui.close();
		
	}

	private void getUserList() {
		for (UserObject uo : ui.getList()) {
			System.out.println(uo);
		}
	}

	private void addUser() {
		try {
			ui.add(new UserObject(getText("이름 : "), Integer.parseInt(getText("포인트 : "))));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NameLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PointValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UserUI();
		System.out.println("END");
	}
}
