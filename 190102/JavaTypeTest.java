package com.ssafy.type;

public class JavaTypeTest {
	
	public static void main(String[] args) {
		int num = 'A';			//큰 타입에 작은값을 넣는것 : 프로모션. 문제가 안됨. 자동 형변환.
		
		System.out.println(num+1);
		System.out.println((char)(num+1));	//강제 형변환.
		
		long num2 = (long)10.7F;		//long은 8바이트, float는 4바이트지만 실수 > 정수이다.. 형변환이 필수.
		
		System.out.println(num2);
		//wrapper class : 기본형에서 자주 쓰는 동작이나 값을 미리 정의 class
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		
		System.out.println("시작");
	}
}
