package com.ssafy.type;

public class JavaTypeTest {
	
	public static void main(String[] args) {
		int num = 'A';			//ū Ÿ�Կ� �������� �ִ°� : ���θ��. ������ �ȵ�. �ڵ� ����ȯ.
		
		System.out.println(num+1);
		System.out.println((char)(num+1));	//���� ����ȯ.
		
		long num2 = (long)10.7F;		//long�� 8����Ʈ, float�� 4����Ʈ���� �Ǽ� > �����̴�.. ����ȯ�� �ʼ�.
		
		System.out.println(num2);
		//wrapper class : �⺻������ ���� ���� �����̳� ���� �̸� ���� class
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		
		System.out.println("����");
	}
}
