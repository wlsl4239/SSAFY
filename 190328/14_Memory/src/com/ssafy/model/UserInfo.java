package com.ssafy.model;

public class UserInfo {
	private String id,name;
	public UserInfo() {};
	public UserInfo(String id,String name) {
		setId(id);
		setName(name);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
