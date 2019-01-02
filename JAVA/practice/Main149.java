package com.ssafy.algo;

import java.util.Scanner;

public class Main149 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 1;
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(num + " ");
				num+=2;
				if(num==11)
					num = 1;
			}
			System.out.println();
		}
	}
}
