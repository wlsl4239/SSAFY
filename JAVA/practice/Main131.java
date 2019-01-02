package com.ssafy.algo;

import java.util.Scanner;

public class Main131 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		
		for(int i=a;i<=b;i++)
			System.out.print(i+" ");
			
	}
}
