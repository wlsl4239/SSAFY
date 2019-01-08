package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation3 {
	
	public static int n,r, data[], caseCount;
	
	public static void permutation(int count) {
		if(count == r) {
			for(int i=0;i<r;i++)
				for(int j=i+1;j<r;j++)  
						if(data[j] == data[i]) return;
			caseCount++;
			System.out.println(Arrays.toString(data));
			return;
		}
		for(int i=1;i<=n;i++) {
			data[count] = i;
			permutation(count+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 6;
		r = 3;
		data = new int[r];
		permutation(0);

		System.out.println(caseCount);
		sc.close();
	}
}

