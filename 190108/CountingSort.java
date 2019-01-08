package array1;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {
		int[] data = {0,4,1,3,1,2,4,1};
		int[] temp = new int[data.length];
		int[] counts = new int[4+1];

		for(int j=0;j<data.length;j++)
			counts[data[j]]++;

		for(int i=1;i<counts.length;i++)
			counts[i] += counts[i-1];

		for(int j=data.length-1;j>=0;j--) {
			counts[data[j]]--;
			temp[counts[data[j]]] = data[j];
		}


		System.out.println(Arrays.toString(temp));
	}
}
