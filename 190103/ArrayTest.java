package com.ssafy.java;

public class ArrayTest {
	public static int[] list={34,23,64,25,12,75,22,88,53,37};
	public static void print(){
		
		StringBuffer br = new StringBuffer();
		for(int i=0;i<list.length;i++) {
			br.append(list[i] + " ");
		}
		
		System.out.println(br.toString());
	}
	public static void total() {
		int sum = 0;
		for(int i=0;i<list.length;i++) {
			sum += list[i];
		}
		System.out.println("배열의 합 : " + sum);
	}
	public static void average(){

		int sum = 0;
		for(int i=0;i<list.length;i++) {
			sum += list[i];
		}
		System.out.println("배열의 평균 : " + sum/list.length);
	}
	public static void minimum(){

		int min = Integer.MAX_VALUE;
		for(int i=0;i<list.length;i++) {
			min = Integer.min(min, list[i]);
		}
		System.out.println("배열의 최소값 : " + min);
	}
	
	public static void selectionSort(){
		int indexMin, temp;

	    for (int i = 0; i < list.length - 1; i++) {
	        indexMin = i;
	        for (int j = i + 1; j < list.length; j++) {
	            if (list[j] < list[indexMin]) {
	                indexMin = j;
	            }
	        }
	        temp = list[indexMin];
	        list[indexMin] = list[i];
	        list[i] = temp;
	    }
	}
	
	public static void main(String[] args) {
		print();
		total();
		average();
		minimum();
		System.out.println("=== selection sort (Ascending Order)===");
		selectionSort();
		print();
	}
}
