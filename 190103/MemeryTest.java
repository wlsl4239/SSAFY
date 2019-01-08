package com.ssafy.type;

import java.lang.reflect.Array;

//type - 기본형(byte ... double)(정적) < 객체(Integer, String, Scanner ...) "new"(heap을 통해 가변적)
//		 기본형 범위 밖의 값을 넣고 결과를 확인.
public class MemeryTest {
	public static void main(String[] args) {
		//byte b1 = 5;	//5는 고정값. vm이 컴파일 단계에서 자동으로 처리함.
		byte b2 = (byte)128;
		int i1 = 5;
		long l1 = 5;
		Integer i2= new Integer("1234");
		int i3 = Integer.parseInt("1234");
		String s1 = "1234";
		char[] sizes = {'S','M','L'};	//클래스, new 없다.
		int[] sizes2 = {44,55,66,77};
		System.out.println(i2 + 1);	//1235  -> int == Integer  VM이 자동으로.
		System.out.println(i3 + 1);
		System.out.println(s1 + 1);
//		System.out.println(i1==b1);
//		System.out.println(l1 == sizes);
		System.out.println("end");
		
		 
	}
}


// 기본형과 연관된 클래스 => 래퍼클래스. 기본형 처럼 쓸 수 있다.
// 