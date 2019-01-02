package com.ssafy.algo;

import java.util.Scanner;

public class Main140 {
public static void main(String[] args) {
	int sum = 0;
	int cnt = 0;

	Scanner sc = new Scanner(System.in);
	
	
	
	while(true)
	{
		int a = sc.nextInt();
		if(a==0 || cnt==20)
			break;
		
		sum+=a;
		cnt++;
	}
	System.out.println(sum + " " + sum/cnt);
}
}
