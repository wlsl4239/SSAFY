package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {
public static void main(String[] args) {
	int [] arr = new int[10];
	int cnt = 0;
	

	Scanner sc = new Scanner(System.in);

	int a;
	
	while(true) {
		a = sc.nextInt();
		if(a==0)
			break;
		
		arr[a/10]++;
		cnt++;
	}
	
	for(int i=1;i<=cnt;i++)
	{
		for(int j=0;j<10;j++)
			if(arr[j] == i)
				System.out.println(j + " : " + i + "°³");
	}
	
	
}
}
