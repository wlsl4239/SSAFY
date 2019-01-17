package com.ssafy.school;
/** 학생 */
//학생은 자신의 정보를 확인할 수 있다		
//학생은 비밀번호를 수정할수있다

public interface StudentInterface extends LoginInterface {
	Student getStudent(String studentNum);
	
	boolean setPW(String studentNum, String newPW);
	boolean setPW(String newPW);
}
