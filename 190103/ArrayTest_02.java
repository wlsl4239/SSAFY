package com.ssafy.array;

import java.util.Scanner;

//�Է¹��� S,M,L�� ������� 44,55,66 �Դϴ�.
public class ArrayTest_02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	char[] sizes = {'S','M','L'};
	int[] sizes2 = {0,0,0};
	
	for(int i=0;i<3;i++)
		sizes2[i] = sc.nextInt();
	
	
	System.out.println("�Է¹���" + sizes[0] + ", " + sizes[1] + ", " + sizes[2] + "�� ������� "+sizes2[0] + ", " + sizes2[1] + ", " + sizes2[2] + "�Դϴ�.");
}
}
