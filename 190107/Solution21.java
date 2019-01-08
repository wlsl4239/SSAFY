package com.ssafy.algo;


import java.io.FileInputStream;
import java.util.Scanner;

public class Solution21 {
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/com/ssafy/algo/Solution21.txt"));
		Scanner sc=new Scanner(System.in);
		int N, S;
		int[] dy = {0,1,0};
		int[] dx = {0,0,1};

		int T=sc.nextInt();  

		for(int test_case=1; test_case<=T; test_case++){

			N=sc.nextInt();
			S=sc.nextInt();

			boolean[][] lake=new boolean[N][N];
			int[][] strider=new int[S][3];
			int result = 0;
			boolean flag = false;


			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();	//행
				strider[k][1]=sc.nextInt();	//열		
				strider[k][2]=sc.nextInt();	//방향

				if(result == 0 && lake[strider[k][0]][strider[k][1]]) {
					result = k+1;
				}

				lake[strider[k][0]][strider[k][1]] = true;
			}


			for(int k=0; k<S; k++){
				if(result == 0) {
					int nowy = strider[k][0];
					int nowx = strider[k][1];
					int dir = strider[k][2];
					for(int i=3;i>0;i--) {	//3칸, 2칸, 1칸 / dy[dir]*i, dx[dir]*i
						nowy += dy[dir]*i;
						nowx += dx[dir]*i;
						if(nowy >= N || nowx >= N)
							break;
						if(lake[nowy][nowx]) {
							result = k+1;
							break;
						}
						lake[nowy][nowx] = true;
					}
				}
			}

			System.out.println("#" + test_case + " " + result);
		}
	}
}