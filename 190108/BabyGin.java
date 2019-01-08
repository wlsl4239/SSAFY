package array1;

import java.util.Scanner;
import java.util.Arrays;

public class BabyGin {

	public static void main(String[] args) {
		int [][] arr = {
				{0,1,2},{1,2,3},{2,3,4},{3,4,5},{4,5,6},{5,6,7},{6,7,8},{7,8,9},{0,8,9},{0,1,9},
				{0,0,0},{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7},{8,8,8},{9,9,9}
				};
		int arr2[][] = new int[400][6];
		
		int cnt = 0;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++) {
				arr2[cnt][0] = arr[i][0];
				arr2[cnt][1] = arr[i][1];
				arr2[cnt][2] = arr[i][2];
				arr2[cnt][3] = arr[j][0];
				arr2[cnt][4] = arr[j][1];
				arr2[cnt][5] = arr[j][2];
				cnt++;
			}
		
		for(int i=0;i<400;i++) 
			Arrays.sort(arr2[i]);

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
			
		for(int test_case = 1; test_case <= T; test_case++) {
			boolean ans = false;
			int[] card = new int[6];
			
			for(int i=0;i<6;i++)
				card[i] = sc.nextInt();	
			
			Arrays.sort(card);
			
			for(int i=0;i<400;i++)
				if(Arrays.equals(arr2[i], card)) {
					ans = true;
					break;
				}
			
			System.out.println(ans);
		}
	}
}
