package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	static int playerWin = 0;
	static int compWin = 0;

	static Scanner sc = new Scanner(System.in);


	public static void rockpaperscissors(int a) {

		while(playerWin != a && compWin != a) {
			System.out.print("가위바위보 중 하나 입력 : ");
			String playerInput = sc.next();
			int playerSelect = 0;
			int compSelect = (int)(Math.random()*3)+1; 

			if(playerInput == "가위")
				playerSelect = 1;
			else if (playerInput == "바위")
				playerSelect = 2;
			else
				playerSelect = 3;


			if(playerSelect == compSelect) {
				System.out.println("비겼습니다!!!");
			}
			else {
				if(playerSelect == 1 && compSelect == 2){
					System.out.println("졌습니다!!!");
					compWin++;
				}

				else if(playerSelect == 2 && compSelect == 3){
					System.out.println("졌습니다!!!");
					compWin++;
				}

				else if(playerSelect == 3 && compSelect == 1){
					System.out.println("졌습니다!!!");
					compWin++;
				}

				else{
					System.out.println("이겼습니다!!!");
					playerWin++;

				}
			}

			if(playerWin == a)
				System.out.println("\n\n### 사용자 승!!!");
			else if(compWin == a)
				System.out.println("\n\n### 컴퓨터 승!!!");
		}

	}
	
	
	public static void main(String[] args) {


		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요");

		int gameMode = sc.nextInt();


		switch(gameMode) {
		case 1:
			rockpaperscissors(3);
			break;

		case 2:
			rockpaperscissors(2);
			break;

		case 3:
			rockpaperscissors(1);
			break;

		}
	}
}

