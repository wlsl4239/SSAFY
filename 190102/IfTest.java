package com.ssafy.type;

import java.util.Scanner;


//숫자 입력값에서 양수만 출력하세요
//입력 ------ 출력
//ctrl + a / ctrl + i

public class IfTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		String s = "양수가 아니다.";
		
		if(inputNumber>0)
			s = "양수";
		else if(inputNumber == 0)
			s = "";
		
		System.out.println(inputNumber + " " + s);

	}
}
