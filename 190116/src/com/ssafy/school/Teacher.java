package com.ssafy.school;



//교사 - 교번, 이름
public class Teacher extends Person {
	private String num;

	public Teacher(String name, String num) {
		super(name);
		setNum(num);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("교사번호 : ");
		builder.append(num);
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	

}
