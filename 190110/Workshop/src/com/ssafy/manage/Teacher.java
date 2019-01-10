package com.ssafy.manage;

public class Teacher {
	private int num;
	private String gender;
	private String phoneNum;
	private int salary[] = new int[12];
	
	public Teacher(int num, String gender, String phoneNum) {
		this.num = num;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}
	public Teacher(int num, String gender, String phoneNum,int[] salary) {
		this.num = num;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.salary = salary;
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
	public int[] getSalary() {
		return salary;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setSalary(int month, int salary) {
		if(month > 12)
			return;
		this.salary[month-1] = salary;
	}
	
	@Override
	public String toString() {
		int totalSalary = 0;
		for(int i=0;i<12;i++) {
			totalSalary += salary[i];
		}
		
		return	"교사번호 : " + num + "\n"	+ 
				"성벌 : " + gender + "\n" + 
				"전화번호 : " + phoneNum + "\n" + 
				"총 급여 : \n" + totalSalary+"\n";
	}

}
