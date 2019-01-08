package com.ssafy.array;

import java.util.Scanner;

//�Է¹��� S,M,L�� ������� 44,55,66 �Դϴ�.
public class ArrayTest_03 {
	
	private static String inputSize() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		return sc.nextLine();
	}

	private static void sizeCheck(String result) {
		int defaultSize = 66;
		switch(result) {
		case "S": case "s":
			defaultSize = 44;
			break;
		case "M": case "m":
			defaultSize = 55;
			break;
		}
		
		printSize(result,defaultSize);	//���
	}

	private static void printSize(String result, int defaultSize) {
		System.out.println("�Է� ���� " + result + "�� ������� " + defaultSize + "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		//�Է�	//ó��
		sizeCheck(inputSize());
		
	}

}
