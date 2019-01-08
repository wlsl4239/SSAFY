package com.ssafy.array;

public class ArrayTest_05 {


	public static void main(String[] args) {

		print(setting());
	}

	private static int[][] setting() {
		// TODO Auto-generated method stub
		int [][] sizes = new int[3][];

		sizes[0] = new int[1];
		sizes[1] = new int[2];
		sizes[2] = new int[5];

		return sizes;
	}

	private static void print(int[][] sizes) {
		// TODO Auto-generated method stub
		/*
		for(int i=0;i<sizes.length;i++) {
			for(int j=0;j<sizes[i].length;j++) {
				System.out.print((int) ((Math.random()*25)+1) + " ");
			}
			System.out.println();
		}
		*/		
			
			//print 호출횟수 줄이기
		
		/*
		String message = "";
		for(int i=0;i<sizes.length;i++) {
			for(int j=0;j<sizes[i].length;j++) {
				message += (int) ((Math.random()*25)+1) + " ";
			}
			message += "\n";
		}
		System.out.print(message);
		*/
			//string 연산 안하기

		StringBuffer br = new StringBuffer();
		for(int i=0;i<sizes.length;i++) {
			for(int j=0;j<sizes[i].length;j++) {
				br.append((int) ((Math.random()*25)+1) + " ");
			}
			br.append("\n");
		}
		System.out.print(br.toString());
	}

}
