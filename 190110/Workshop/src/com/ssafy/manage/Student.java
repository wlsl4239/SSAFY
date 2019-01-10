package com.ssafy.manage;

import java.util.Arrays;

public class Student {
	private int num;
	private String gender;
	private String phoneNum;
	private double[] grade = new double[10];
	
	public Student(int num, String gender, String phoneNum) {
		this.num = num;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}
	public Student(int num, String gender, String phoneNum, double[] grade) {
		this.num = num;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.grade = grade;
	}
	
	public int getNum() {
		return num;
	}
	public String getGender() {
		return gender;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	private double[] getGrade() {
		return grade;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setGrade(int semester,double grade) {
		if(semester > 10)
			return;
		this.grade[semester-1] = grade;
	}


	@Override
	public String toString() {
		String grades = "";
		for(int i=0;i<10;i++) {
			if(grade[i] == 0.0)
				break;
			grades += Integer.toString(i+1) + "학기 : " + grade[i] + "\n";
		}
		
		return	"학번 : " + num + "\n"	+ 
				"성벌 : " + gender + "\n" + 
				"전화번호 : " + phoneNum + "\n" + 
				"학점 \n" + grades;
	}
	
	
	
}
