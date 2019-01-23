package com.ssafy.user;
// 사용자 정의 예외 클래스 작성
// 1. 클래스명 : xxxxException
// 2. Exception 계열을 상속.	-> checked, unchecked여부를 결정할 수 있다.
// 3. 부모 클래스에 문자열을 전달.  super()	-> exception class는 생성자만 있는경우가 대부분이다.
public class CustomerNameLengthException extends Exception {
	public CustomerNameLengthException(String message) {
		super(message);
	}
	
}
