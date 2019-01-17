package com.ssafy.school;

public class StudentEmail extends AbstractStudent implements LoginInterface, StudentInterface{
	@Override
	public boolean login(String id, String pw) {
		System.out.println("Email login");
		return false;
	}
	

}
