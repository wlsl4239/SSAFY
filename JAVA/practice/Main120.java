package com.ssafy.algo;

import java.util.Scanner;

public class Main120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b)
			System.out.println(a-b);
		else
			System.out.println(b-a);
	}
	
}
