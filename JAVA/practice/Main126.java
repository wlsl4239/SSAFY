package com.ssafy.algo;

import java.util.Scanner;

public class Main126 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int a;
		int odd = 0;
		int even = 0;
		while(true) {
			a = sc.nextInt();
			if(a == 0)
				break;
			
			if(a%2 == 0)
				even++;
			else
				odd++;
			
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
