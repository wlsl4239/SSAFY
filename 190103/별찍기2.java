package com.ssafy.java;

public class º°Âï±â2 {

	public static void main(String[] args) {


		int num = 1;

		for(int i=0;i<3;i++) {

			for(int j=5-i;j<5;j++) {
				System.out.print("\t");
			}
			for(int j=2*i;j<5;j++) {
				System.out.print(num+"\t");
				num++;
			}

			System.out.println();
		}
	
		for(int i=1;i>=0;i--) {

			for(int j=5-i;j<5;j++) {
				System.out.print("\t");
			}
			for(int j=2*i;j<5;j++) {
				System.out.print(num+"\t");
				num++;
			}

			System.out.println();
		}

	}
}
