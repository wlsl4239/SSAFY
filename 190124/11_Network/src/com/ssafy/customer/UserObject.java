package com.ssafy.customer;

import java.io.Serializable;

// data 중심으로 구조를 정의한 클래스 => VO(value object)
public class UserObject implements Serializable{
	private String name;
	private int point;
	
	public UserObject(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}
	
	public UserObject() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + point;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserObject other = (UserObject) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (point != other.point)
			return false;
		return true;
	}
	
	
}
