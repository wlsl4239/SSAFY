package com.ssafy.type;

import java.util.Scanner;
//1~10까지 입력받고 20까지의 값을 출력하세요
//ex) 1~10까지 입력: 8	// 8 9 ... 18 19 20
public class LoopTest_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1~10까지 입력 : ");
		
		int number = 0;
		while(true) {
			
			number = sc.nextInt();
			if(number >= 1 && number <=10)
				break;
		}
		
		

		for(int i = number; i <= 20; i++) {
			System.out.print(i+" ");
		}
	}
}
