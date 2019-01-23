package com.ssafy.user;

//고객의 정보를 입력받음
//고객의 이름은 2자이상.
//포인트는 0점이상.
//고객등록시 기본포인트 5점 부여


public class Customer  {
	private String name;
	private int point;
	
	public Customer(String name)throws CustomerNameLengthException {
		setName(name);
		setPoint(5);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name)throws CustomerNameLengthException {
		if(name == null || name.length()<2)
			throw new CustomerNameLengthException(name);
			
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("name=");
		builder.append(name);
		builder.append(", point=");
		builder.append(point);
		return builder.toString();
	}
	
	
	
}
