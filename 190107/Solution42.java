package com.ssafy.algo;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution42 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/com/ssafy/algo/Solution42.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//테스트 케이스 수  

		int[] dy = {0,-1,0,1,0};
		int[] dx = {0,0,1,0,-1};

		for(int test_case=1; test_case<=T; test_case++){
			int N = sc.nextInt();
			int y = sc.nextInt();
			int x = sc.nextInt();
			int jumperNum = sc.nextInt();

			boolean[][] board = new boolean[N+1][N+1];

			for(int i=0;i<jumperNum;i++)
			{
				int jumpy = sc.nextInt();
				int jumpx = sc.nextInt();
				board[jumpy][jumpx] = true;
			}

			int moveNum = sc.nextInt();

			int jumpDir;
			int jumpNum;
			for(int i=0;i<moveNum;i++) {
				jumpDir = sc.nextInt();
				jumpNum = sc.nextInt();

				if(!(x == 0 && y == 0)) {
					if(y + dy[jumpDir]*jumpNum > N || y + dy[jumpDir]*jumpNum <= 0 || x + dx[jumpDir]*jumpNum > N || x + dx[jumpDir]*jumpNum <= 0) {
						y = 0;
						x = 0;
					}
					else {
						for(int j=0;j<jumpNum;j++) {
							y += dy[jumpDir];
							x += dx[jumpDir];

							if(board[y][x]) {
								y = 0;
								x = 0;
								break;
							}
						}
					}
				}
			}

			System.out.println("#" + test_case + " " + y + " " + x);
		}

	}
}
