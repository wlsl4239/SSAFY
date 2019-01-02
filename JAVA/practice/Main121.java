package com.ssafy.algo;

import java.util.Scanner;

public class Main121 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	String str = "";
	if(a == 0)
		str = "zero";
	else if(a>0)
		str = "plus";
	else
		str = "minus";
	
	System.out.println(str);
}
}
