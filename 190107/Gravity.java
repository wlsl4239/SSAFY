package array1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Gravity {
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/Gravity_input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int[] data = new int [n];

			int ans = 0;

			for(int i=0;i<n;i++)
				data[i] = sc.nextInt();

			for(int i=0;i<data.length;i++) {
				int cnt = 0;
				for(int j=i+1;j<data.length;j++) {
					if(data[i] > data[j])
						cnt++;
				}
				ans = Math.max(cnt, ans);
			}
			System.out.println("#"+test_case+" " + ans);
		}
	}
}
