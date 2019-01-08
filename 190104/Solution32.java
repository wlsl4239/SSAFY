package com.ssafy.algo;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution32 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/com/ssafy/algo/Solution32.txt"));

		Scanner sc = new Scanner(System.in);
		int x,y,n;	
		int t = sc.nextInt();

		for(int test = 1;test<=t;test++) {

			y = sc.nextInt();
			x = sc.nextInt();
			n = sc.nextInt();

			int[][] direction = new int [y+1][x+1];
			int[][] jump = new int[y+1][x+1]; 
			int[][] person = new int[n][3];
			boolean[][] trap = new boolean[y+1][x+1];
			
			int trapNum;
			int result = -1000 * n;

			for(int i=1;i<=y;i++){
				for(int j=1;j<=x;j++) {
					int a = sc.nextInt();
					direction[i][j] = a/10;
					jump[i][j] = a%10;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<3;j++)
					person[i][j] = sc.nextInt();
			}

			trapNum = sc.nextInt();
			for(int i=0;i<trapNum;i++) {
				int trapy = sc.nextInt();
				int trapx = sc.nextInt();
				trap[trapy][trapx] = true;
			}
			
			for(int i=0;i<n;i++) {
				int cnt = 0;
				int nowy = person[i][0];
				int nowx = person[i][1];
				while(true) {
					if(nowx > x || nowx <= 0 || nowy > y || nowy <= 0 || trap[nowy][nowx])
						break;
					if(cnt == person[i][2]) {
						result += direction[nowy][nowx]*1000 + jump[nowy][nowx]*100;
						break;
					}

					switch(direction[nowy][nowx]) {
					case 1:
						nowx += jump[nowy][nowx];
						break;
					case 2:
						nowy += jump[nowy][nowx];
						break;
					case 3:
						nowx -= jump[nowy][nowx];
						break;
					case 4:
						nowy -= jump[nowy][nowx];
						break;
					}
					cnt++;
				}
			}
			System.out.println("#" + test + " " + result);
		}
	}
}