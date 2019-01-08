package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		int c = 100-b;
		
		System.out.print(100 + "  "+b+" ");
		
		while(true) {
			System.out.print(c + "  ");
			if(c<0)
				break;
			int temp = b-c;
			b = c;
			c = temp;
			
		}
	
	}
}
