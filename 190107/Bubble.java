package array1;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] data = {55,7,78,12,42};
		System.out.println(Arrays.toString(data));
		for(int i=data.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(data[j]>data[j+1]) {
					int tmp=data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
				
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
