package com.ssafy.type;

import java.util.Scanner;


//���� �Է°����� ����� ����ϼ���
//�Է� ------ ���
//ctrl + a / ctrl + i

public class IfTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		String s = "����� �ƴϴ�.";
		
		if(inputNumber>0)
			s = "���";
		else if(inputNumber == 0)
			s = "";
		
		System.out.println(inputNumber + " " + s);

	}
}
