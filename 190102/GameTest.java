package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	static int playerWin = 0;
	static int compWin = 0;

	static Scanner sc = new Scanner(System.in);


	public static void rockpaperscissors(int a) {

		while(playerWin != a && compWin != a) {
			System.out.print("���������� �� �ϳ� �Է� : ");
			String playerInput = sc.next();
			int playerSelect = 0;
			int compSelect = (int)(Math.random()*3)+1; 

			if(playerInput == "����")
				playerSelect = 1;
			else if (playerInput == "����")
				playerSelect = 2;
			else
				playerSelect = 3;


			if(playerSelect == compSelect) {
				System.out.println("�����ϴ�!!!");
			}
			else {
				if(playerSelect == 1 && compSelect == 2){
					System.out.println("�����ϴ�!!!");
					compWin++;
				}

				else if(playerSelect == 2 && compSelect == 3){
					System.out.println("�����ϴ�!!!");
					compWin++;
				}

				else if(playerSelect == 3 && compSelect == 1){
					System.out.println("�����ϴ�!!!");
					compWin++;
				}

				else{
					System.out.println("�̰���ϴ�!!!");
					playerWin++;

				}
			}

			if(playerWin == a)
				System.out.println("\n\n### ����� ��!!!");
			else if(compWin == a)
				System.out.println("\n\n### ��ǻ�� ��!!!");
		}

	}
	
	
	public static void main(String[] args) {


		System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���");

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

