package com.ssafy.type;

import java.util.Scanner;
//1~10���� �Է¹ް� 20������ ���� ����ϼ���
//ex) 1~10���� �Է�: 8	// 8 9 ... 18 19 20
public class LoopTest_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1~10���� �Է� : ");
		
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
