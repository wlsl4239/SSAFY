package com.ssafy.customer;

import java.util.Collection;

/**
 * 고객의 정보를 입력받음
고객의 이름은 2자이상.
포인트는 0점이상.
고객등록시 기본포인트 5점 부여
 */
public interface IUser {
	void add(UserObject user) throws NameLengthException, PointValueException ;
	//프로그램 실행시 파일에서 고객 정보를 얻어온다.
	void loading(); //나중에 생성자에서 구현 or 호출
	/**전체 고객 정보를 가져오기 또는 검색하기*/
	Collection<UserObject> getList();
	//프로그램 종료시 파일에 저장.
	void close();
}
