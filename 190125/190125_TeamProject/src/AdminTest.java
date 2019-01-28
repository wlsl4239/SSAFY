import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminTest {
	
	
//	//Impl 객체 생성
//	private Scanner sc = new Scanner(System.in);
//	public AdminUI() {
//		while(true) {
//			System.out.println("1.로그인 2.관리자 등록 0.프로그램 종료");
//			switch(sc.nextLine()) {
//			case "1":
//				login();
//				break;
//			case "2":
//				addAdmin();
//				break;
//			case "":
//				System.out.println("종료합니다.");
//
//				break;
//			}
//		}
//		//1]로그인
//
//
//		/*
//
//  //로그인상태이면 //if(login(String id, String pw)) else "로그인정보가 없다."
//  switch() {
//  case "1":
//  //1. 고객등록
//  addCutomer()
//  break;
//  case "2":
//  //2. 고객수정
//  updateCutomer()
//  break;
//  case "3":
//  //3. 고객 삭제
//  deleteCutomer()
//  break;
//  //4. 고객 정보 확인
//
//  //5. 서버로 전송
//  case "5":
//  send()
//  break
//  //2] 관리자 등록
//  }*/
//
//	}
//
//	private void addAdmin() {
//
//	}
//
//	private void login() {
//
//
//	}
	public static void main(String[] args) {
//		new AdminUI();
		
		AdminImpl ai = new AdminImpl();
		
		try {
			ai.addAdmin("1111", "123", "aa");
			ai.addAdmin("123456789", "123", "aa");
			System.out.println(ai.logIn("123456789", "122"));
			System.out.println(ai.logIn("123456789", "123"));		
			ai.addCustomer("111111111", "555", "bb", 99);
			ai.addCustomer("111111112", "565", "bbc", 2);
			ai.addCustomer("111111113", "575", "bbd", 3);
			
			for (Person p : ai.getCustomers()) {
				System.out.println(p);
			}
			System.out.println();
			
			ai.updateCustomer("111111111", "555", "bbbb", 3);
			
			for (Person p : ai.getCustomers()) {
				System.out.println(p);
			}
			System.out.println();
			
			ai.removeCustomer("111111111");
			for (Person p : ai.getCustomers()) {
				System.out.println(p);
			}
			System.out.println();
		} catch (Exception e) {e.printStackTrace();	}		
	}
}