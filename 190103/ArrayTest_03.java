package com.ssafy.array;

import java.util.Scanner;

//입력받은 S,M,L의 사이즈는 44,55,66 입니다.
public class ArrayTest_03 {
	
	private static String inputSize() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사이즈 입력 : ");
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
		
		printSize(result,defaultSize);	//출력
	}

	private static void printSize(String result, int defaultSize) {
		System.out.println("입력 받은 " + result + "의 사이즈는 " + defaultSize + "입니다.");
	}
	
	public static void main(String[] args) {
		//입력	//처리
		sizeCheck(inputSize());
		
	}

}
