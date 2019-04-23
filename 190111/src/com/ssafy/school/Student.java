package com.ssafy.school;

import java.util.Arrays;

public class Student {
	private String studentNumber;
	private char gender;
	private String phoneNumber;
	private double[] grade;
	private int gradeIndex;
	/**생성자*/
	
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public Student(String studentNumber, char gender, String phoneNumber) {
		setStudentNumber(studentNumber);
		setGender(gender);
		setPhoneNumber(phoneNumber);
		this.grade = new double[10];	//"" -1
		gradeIndex = 0;
	}
	
	
	private void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}	
	private void setGender(char gender) {
		switch(gender) {
		case'M' :
		case'F' :
		case'm' :
		case'f' :
			this.gender = gender;
		}
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public char getGender() {
		return gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public double[] getGrade() {
		if(gradeIndex == 0) return null;
		
		double[] tempGrade = new double[gradeIndex];
		for(int i=0;i<gradeIndex;i++)
			tempGrade[i] = grade[i];
		return tempGrade;
	}
	
	
	public boolean addGrade(double grade) {
		if(gradeIndex >=10) return false;
			
		this.grade[gradeIndex++] = grade;
		return true;
	}
	
	public boolean setGrade(int semester, double grade) {
		if(semester < 1 || semester > 10 || semester > gradeIndex) return false;
		
		this.grade[semester-1] = grade;
		return true;
	}
	
	@Override
	public String toString() {
		return "studentNumber=" + studentNumber + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ ", grade=" + Arrays.toString(getGrade());
	}
	
	
	
	
}
