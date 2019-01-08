package com.ssafy.array;
//44 s 55 m 66 l
public class ArrayTest_04 {
	public static void main(String[] args) {
		
		int [][] sizes = {{44,55,66,77,88,99},{'S','M','L'}};
		
		for(int i=0;i<sizes.length;i++) {
			for(int j=0;j<sizes[i].length;j++) {
				System.out.print(sizes[i][j] + " ");
			}
			System.out.println();
		}
	}
}
