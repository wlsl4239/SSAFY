package com.ssafy.school;

//업무 분석시 공통의 멤버가 있으면 먼저 구현한다.
//학생 : 학번, 이름
//교사 : 교번, 이름
//정보를 출력한다()
// -> 공통 : 이름, 출력한다()
public class Person {

	private String name;

	public Person(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.append("이름 : ").append(name).toString();
	}


}
