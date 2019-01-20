package com.ssafy.movie;

import java.util.ArrayList;
import java.util.Collection;

public class Member {
	private String num;
	private String name;
	private Collection<Movie> list;
	
	public Member(String num, String name) {
		super();
		this.num = num;
		this.name = name;
		list = new ArrayList();
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Movie> getList() {
		return list;
	}
	public void setList(Collection<Movie> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("회원 번호 : ");
		builder.append(num);
		builder.append(", 이름 : ");
		builder.append(name);
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
	
}
