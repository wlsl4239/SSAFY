package com.ssafy.type;

import java.util.Random;

//�Է°�����.... Scanner
//�����ǰ���, �����ϰ�.... 0<=val<1
//�ζ� 1~45


public class LoopTest_04 {
	public static void main(String[] args) {
		double d = Math.random();

		System.out.println((int)(d*45+1));

		Random r = new Random();
		System.out.println(r.nextInt(45)+1);
	}

}
