package com.ssafy.model;

public class MemberVo {
	private String id,pw,name,gender,birthday;

	public MemberVo() {};
	public MemberVo(String id, String pw, String name, String gender, String birthday) {
		setId(id);
		setPw(pw);
		setName(name);
		setGender(gender);
		setBirthday(birthday);
	}
	public MemberVo(String id, String name, String gender, String birthday) {
		setId(id);
		setName(name);
		setGender(gender);
		setBirthday(birthday);
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + "]";
	}
	
	
}
