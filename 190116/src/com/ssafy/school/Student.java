package com.ssafy.school;

import com.ssafy.school.Person;

public class Student extends Person{
	private String num;
	
	public Student(String num, String name) {
		super(name);
		setNum(num);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	//상속받은 메서드 중에서 구현부가 맘에 안들면 변경 가능
	// => overriding
	// ===> 상속이 전제조건.

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("학번 : ");
		builder.append(num);
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}
	

}
