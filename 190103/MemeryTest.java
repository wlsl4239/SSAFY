package com.ssafy.type;

import java.lang.reflect.Array;

//type - �⺻��(byte ... double)(����) < ��ü(Integer, String, Scanner ...) "new"(heap�� ���� ������)
//		 �⺻�� ���� ���� ���� �ְ� ����� Ȯ��.
public class MemeryTest {
	public static void main(String[] args) {
		//byte b1 = 5;	//5�� ������. vm�� ������ �ܰ迡�� �ڵ����� ó����.
		byte b2 = (byte)128;
		int i1 = 5;
		long l1 = 5;
		Integer i2= new Integer("1234");
		int i3 = Integer.parseInt("1234");
		String s1 = "1234";
		char[] sizes = {'S','M','L'};	//Ŭ����, new ����.
		int[] sizes2 = {44,55,66,77};
		System.out.println(i2 + 1);	//1235  -> int == Integer  VM�� �ڵ�����.
		System.out.println(i3 + 1);
		System.out.println(s1 + 1);
//		System.out.println(i1==b1);
//		System.out.println(l1 == sizes);
		System.out.println("end");
		
		 
	}
}


// �⺻���� ������ Ŭ���� => ����Ŭ����. �⺻�� ó�� �� �� �ִ�.
// 