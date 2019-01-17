package com.ssafy.school;

public class StudentPhoneNumber extends AbstractStudent implements StudentInterface {

	@Override
	public boolean login(String id, String pw) {
		System.out.println("PhoneNumber login");
		return false;
	}

	

}
