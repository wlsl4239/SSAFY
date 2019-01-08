package com.ssafy.array;

import java.util.Scanner;

//입력받은 S,M,L의 사이즈는 44,55,66 입니다.
public class ArrayTest_02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	char[] sizes = {'S','M','L'};
	int[] sizes2 = {0,0,0};
	
	for(int i=0;i<3;i++)
		sizes2[i] = sc.nextInt();
	
	
	System.out.println("입력받은" + sizes[0] + ", " + sizes[1] + ", " + sizes[2] + "의 사이즈는 "+sizes2[0] + ", " + sizes2[1] + ", " + sizes2[2] + "입니다.");
}
}
