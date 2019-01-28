import java.util.Scanner;

public class AdminUI {
	//Impl 객체 생성
	private Scanner sc = new Scanner(System.in);
	private AdminImpl ai;
	public AdminUI() {
		ai = new AdminImpl();
		/*
		try {//기본정보 등록
			ai.addAdmin("123456789", "111", "관리자1");
			//ai.addAdmin("12345678", "111", "관리자2");
			ai.addCustomer("987654321", "111", "홍길동",10);
			//ai.addCustomer("789456123", "111", "강감찬",5);
		} catch (idLengthException e) {
		} catch (nameLengthException e) {
		} catch (idExistedException e) {
		}catch (pointLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		while(true) {
			System.out.println("1.로그인 2.관리자 등록 0.프로그램 종료");
			switch(sc.nextLine()) {
			case "1":
				login();
				break;
			case "2":
				addAdmin();
				break;
			case "0":
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			}
		}

	}
	private String getString(String text) {
		String result;
		System.out.print(text+": ");
		result = sc.nextLine();
		return result;
	}
	private void addAdmin() {
		while(true) {
			//String newAdminInfor = sc.nextLine();
			try {
				ai.addAdmin(getString("관리자등록] ID를 입력하세요(8글자이상)"), getString("관리자등록] 비밀번호를 입력하세요"),getString("관리자등록] 이름을 입력하세요(2글자이상)"));
				System.out.println("등록완료");
			} catch (idLengthException e) {
				System.out.println("ID는 8글자이상이어야합니다.");
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (nameLengthException e) {
				System.out.println("이름은 2글자이상이어야합니다.");
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (idExistedException e) {
				System.out.println("이미 존재하는 ID입니다.");
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch( Exception e) {
				//e.printStackTrace();
			}finally {
				if(getString("다시등록하시려면 아무키나 누르세요.(0.종료)").equals("0"))return;
			}
		}

	}

	private void login() {

		while(true) {
			try {
				if(ai.logIn(getString("Login] Id를 입력하세요"), getString("Login] 비밀번호를 입력하세요"))) {
					while(true) {
						System.out.println("상태 : 로그인");
						switch(getString("메뉴를 선택하세요 1.고객등록 2.고객정보수정 3.고객정보삭제 \n 4.고객정보확인 5.서버로 전송 6.로그아웃 0.프로그램종료\n")) {
						case "1"://1. 고객등록
							addCutomer();
							break;
						case "2"://2. 고객수정
							updateCustomer();
							break;
						case "3"://3. 고객 삭제
							removeCutomer();
							break;
						case "4"://4. 고객 정보 확인
							System.out.println(ai.getCustomers());
						case "5"://5. 서버로 전송
							ai.send();
							break;
						case "6"://로그아웃
							return;
						case "0":
							System.exit(0);
							break;	
						}
					}
				}else {
					System.out.println("없는 아이디 입니다. ");
				}
			} catch (idNotExistedException e) {
				System.out.println("존재하지 않는 아이디 입니다.");
				//e.printStackTrace();
			} finally {
				if(getString("다시 로그인하시려면 아무키나 누르세요.(0.종료)").equals("0"))return;
			}
		}
	}


	private void updateCustomer() {
		
		while(true) {
			System.out.println("변경할 고객의 정보를 입력하세요.");
			try {
					ai.updateCustomer(getString("변경할 고객의 ID를 입력하세요"), getString("새로운 비밀번호를 입력하세요"), getString("새로운 이름을 입력하세요"), Integer.parseInt(getString("포인트를 입력하세요")));
				System.out.println("변경완료");
			} catch (NumberFormatException e) {
				//e.printStackTrace();
			} catch (idNotExistedException e) {
				System.out.println("존재하지않는 ID입니다.");
				//e.printStackTrace();
			}catch (pointLengthException  e) {
				System.out.println("포인트는 0점이상이어야합니다.");
				//e.printStackTrace();
			}catch( nameLengthException e) {
				System.out.println("이름은 2글자이상이어야합니다.");
			}
			finally {
				if(getString("다시 변경하시려면 아무키나 누르세요.(0.종료)").equals("0"))return;
			}
		}
	}
	private void removeCutomer() {
		
		while(true) {
			System.out.println("삭제할 고객의 정보를 입력하세요.");
			try {
				ai.removeCustomer(getString("고객삭제] 삭제할 ID를 입력하세요"));
				System.out.println("삭제완료");
			} catch (NumberFormatException e) {
				//e.printStackTrace();
			} catch (idNotExistedException e) {
				System.out.println("존재하지않는 ID입니다.");
				//e.printStackTrace();
			}finally {
				if(getString("다시 삭제하시려면 아무키나 누르세요.(0.종료)").equals("0"))return;
			}
		}
	}
	private void addCutomer() {

		while(true) {
			System.out.println("등록할 고객의 정보를 입력하세요.");
			try {
				ai.addCustomer(getString("고객등록] ID를 입력하세요(8글자이상)"), getString("고객등록] 비밀번호를 입력하세요"), getString("고객등록] 이름을 입력하세요(2글자이상)"), Integer.parseInt(getString("고객등록] 포인트를 입력하세요(0점이상)")));
				System.out.println("등록완료");
			} catch (NumberFormatException e) {

				//e.printStackTrace();
			} catch (idLengthException e) {
				System.out.println("ID는 8글자이상이어야합니다.");
				//e.printStackTrace();
			} catch (pointLengthException e) {
				System.out.println("포인트는 0점이상이어야합니다.");
				//e.printStackTrace();
			} catch (nameLengthException e) {
				System.out.println("이름은 2글자이상이어야합니다.");
				//e.printStackTrace();
			} catch (idExistedException e) {
				System.out.println("이미 존재하는 ID입니다.");

				//e.printStackTrace();
			}finally {
				if(getString("다시등록하시려면 아무키나 누르세요.(0.종료)").equals("0"))return;
			}
		}
	}

	public static void main(String[] args) {
		new AdminUI();
	}

}
