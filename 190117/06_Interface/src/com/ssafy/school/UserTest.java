package com.ssafy.school;

import java.util.Collection;

public class UserTest {
	public static void main(String[] args) {
		UserImpl ui = new UserImpl();
		System.out.println(ui.searchAll());
		ui.add(new UserObject("홍길동", 10));
		ui.add(new UserObject("홍길동", 10));
		ui.add(new UserObject("이순신", 10));
		ui.add(new UserObject("김경수", 25));
		System.out.println(ui.searchAll());
		
		
		
		for (UserObject userObject : ui.searchAll()) {
			System.out.println(userObject);
		}
		
		System.out.println(ui.search("홍길동"));
		
		for (UserObject userObject : ui.searchAge(10)) {
			System.out.println(userObject);
		}
		
		System.out.println(ui.setAge("이순신", 30));
		System.out.println(ui.search("이순신"));
		
		System.out.println(ui.setAge(new UserObject("홍길동", 10) ,20));
		System.out.println(ui.search("홍길동"));
	}
}
