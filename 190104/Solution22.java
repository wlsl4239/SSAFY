package com.ssafy.algo;


import java.io.FileInputStream;
import java.util.Scanner;

public class Solution22 {
	static long Answer;
	static int N, S;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/com/ssafy/algo/Solution22.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//테스트 케이스 수  
		
		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //배열의 크기 NxN
			boolean[][] lake=new boolean[N][N];
			boolean[][] start=new boolean[N][N];
			int death = 0;
			
			S=sc.nextInt();//소금쟁이(Strider)수
			int[][] strider=new int[S][3];
			
			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();//행위치
				strider[k][1]=sc.nextInt();//열위치				
				strider[k][2]=sc.nextInt();//방향(1:상 2:하 3:좌 4:우)
				
				if(start[strider[k][1]][strider[k][0]])
					death++;
				
				start[strider[k][1]][strider[k][0]] = true;
			}
			
			
			for(int k=0; k<S; k++){
				
				switch(strider[k][2]) {
				case 1:
					if(strider[k][0] - 6 < 0)
						death++;
					else if(lake[strider[k][0] - 3][strider[k][1]] || 
							lake[strider[k][0] - 5][strider[k][1]] || 
							lake[strider[k][0] - 6][strider[k][1]])
						death++;
					else
						lake[strider[k][0] - 6][strider[k][1]] = true;
					break;
				case 2:
					if(strider[k][0] + 6 >= N)
						death++;
					else if(lake[strider[k][0] + 3][strider[k][1]] || 
							lake[strider[k][0] + 5][strider[k][1]] || 
							lake[strider[k][0] + 6][strider[k][1]])
						death++;
					else
						lake[strider[k][0] + 6][strider[k][1]] = true;
					break;		
				case 3:
					if(strider[k][1] - 6 < 0)
						death++;
					else if(lake[strider[k][0]][strider[k][1] - 3] || 
							lake[strider[k][0]][strider[k][1] - 5] || 
							lake[strider[k][0]][strider[k][1] - 6])
						death++;
					else
						lake[strider[k][0]][strider[k][1] - 6] = true;
					break;
				case 4:
					if(strider[k][1] + 6 >= N)
						death++;
					else if(lake[strider[k][0]][strider[k][1] + 3] || 
							lake[strider[k][0]][strider[k][1] + 5] || 
							lake[strider[k][0]][strider[k][1] + 6])
						death++;
					else
						lake[strider[k][0]][strider[k][1] + 6] = true;
					break;
				}
				
				
			}
			
			Answer = S - death;
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}
