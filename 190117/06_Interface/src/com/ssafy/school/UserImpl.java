package com.ssafy.school;

import java.util.Collection;
import java.util.HashSet;

public class UserImpl implements UserInterface{
	private Collection<UserObject> users;
	
	public UserImpl() {
		this(new HashSet());
	}
	
	public UserImpl(Collection<UserObject> users) {
		this.users = users;
	}

	@Override
	public boolean add(UserObject userObject) {
		return users.add(userObject);
	}

	@Override
	public UserObject search(String name) {
		for (UserObject userObject : users) 
			if(userObject.getName().equals(name))
				return userObject;
		
		return null;
	}

	@Override
	public Collection<UserObject> searchAge(int age) {
		Collection<UserObject> temp = new HashSet();
		
		for (UserObject user : users) 
			if(user.getAge()==age)
				temp.add(user);
		
		
		return temp;
	}

	@Override
	public boolean setAge(UserObject userObject, int age) {
		return setAge(userObject.getName(),age);
	}

	@Override
	public boolean setAge(String name, int age) {
		for (UserObject userObject : users) {
			if(userObject.getName().equals(name)) {
				userObject.setAge(age);
				return true;
			}
		}
		return false;
	}

	@Override
	public Collection<UserObject> searchAll() {
		return users;
	}

	
}
