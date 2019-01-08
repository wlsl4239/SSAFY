package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation2 {
	
	public static int n,r, data[], caseCount;
	
	public static void permutation(int before, int count) {
//		if(count == n) {
		if(count == r) {
			caseCount++;
			System.out.println(Arrays.toString(data));
			return;
		}
		for(int i=before;i<=n;i++) {
			data[count] = i;
			permutation(i,count+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 9;
		r = 9;
//		data = new int[n];
		data = new int[r];
		permutation(1,0);

		System.out.println(caseCount);
		sc.close();
	}
}


//뭐하는건지 모르겠네