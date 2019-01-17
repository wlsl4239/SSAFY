package com.ssafy.school;

import java.util.Collection;

public interface UserInterface {
	// 사용자를 추가할 수 있다.
	boolean add(UserObject userObject) ;
	
	// 이름으로 사용자 정보를 확인 할 수 있다.
	UserObject search(String name) ;
	
	// 같은 나이의 사용자 정보를 확인 할 수 있다.
	Collection<UserObject> searchAge(int age) ;
	
	// 특정 사용자의 나이를 수정 할 수 있다.
	boolean setAge(UserObject userObject, int age) ;
	boolean setAge(String name, int age) ;
	
	// 모든 사용자의 정보를 확인 할 수 있다.
	Collection<UserObject> searchAll() ;
}
