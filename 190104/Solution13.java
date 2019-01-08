package com.ssafy.algo;

import java.util.Scanner;
import java.io.FileInputStream;

import java.io.FileInputStream;

public class Solution13 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/com/ssafy/algo/Solution13.txt"));

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] dirX = {1, 0,-1,-1,-1, 0, 1, 1};
		int[] dirY = {1, 1, 1, 0,-1,-1,-1, 0};

		for(int tc=1;tc<=test;tc++) {

			int n = sc.nextInt();

			int max = 0;
			char[][] arr = new char[n][n];

			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j] = sc.next().charAt(0);
					if(arr[i][j] == 'B')
						max = 2;
				}
			}

			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					boolean flag = true;

					for(int k=0;k<8;k++) {
						if(i+dirX[k] < 0 || i+dirX[k] >= n || j+dirY[k] < 0 || j+dirY[k] >= n)
							continue;

						if(arr[i+dirX[k]][j+dirY[k]] == 'G') {
							flag = false;
							break;
						}	
					}

					if(flag) {
						int num = 0;

						for(int k=0;k<n;k++) {
							if(arr[i][k] == 'B')
								num++;
							if(arr[k][j] == 'B')
								num++;
						}
						num--;
						max = Integer.max(max, num);
					}
				}
			}
			System.out.println("#" + tc + " " +max);
		}
	}
}

