package com.ssafy.movie;
//TTD. operation 중심으로 코딩
public class Customer {
	//고객의 이름
	private String name;
	//고객의 포인트
	private int point;
	private String id;
	
	public Customer() {
		point = -1;
	}
		
	public Customer(String id, String pw) {
		if(!login(id,pw)) {
			// 생성자는 return이 없다. 
			// 예외관리정책 
			System.out.println("Login Error!");
			return;
		}
		this.id = id;
	}


	//고객 로그인	
	public boolean login(String id, String pw) {
		if(id.equals("kim") && pw.equals("1234")) {
			name = "김경수";
			point = 75;
			return true;
		}
		return false;
	}

	//고객 이름
	public String getName() {
		return name;
	}
	//고객 보유 포인트
	public int getPoint() {
		return point;
	}
	public String getId() {
		return id;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "name=" + name + ", point=" + point + ", id=" + id;
	}
	
	
}
