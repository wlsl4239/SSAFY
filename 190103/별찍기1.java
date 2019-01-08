package com.ssafy.java;

public class º°Âï±â1 {
	public static void main(String[] args) {
		
		
		int num = 1;
		
		for(int i=0;i<5;i++) {
			
			for(int j=5-i;j<5;j++) {
				System.out.print("\t");
			}
			for(int j=i;j<5;j++) {
				System.out.print(num+"\t");
				num++;
			}
			
			System.out.println();
		}
			
		
	}
}
