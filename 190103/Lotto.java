package com.ssafy.java;

public class Lotto {

	private static void print() {
		StringBuffer br = new StringBuffer();
		int[] result = new int[6];
		boolean[] check = new boolean[46];
		int cnt = 0;

		while(true) {
			if(cnt == 6)
				break;
			
			int num = (int) (Math.random() * 45)+1;
			if(check[num]==true)
				continue;
			
			check[num] = true;
			br.append(num+" ");
			cnt++;
		}
		System.out.println(br.toString());
	}
	
	public static void main(String[] args) {
		print();
	}
}
