package com.ssafy.type;
//�ݺ��� - �迭 - ���� �ڷ����� �������� �޸𸮿� �ְ� �ݺ������� ó��
//�䱸���� : ������� 44, 55, 66, 77 ���� �Դϴ�.
public class LoopTest_02 {
	public static void main(String[] args) {
		int sizes[];		// ����
		sizes = new int[4];	// new��� => ��ü, ���� ���̸� ��밡��. -> heap
							// heap Ư¡ 1) ������ ����Ұ�. 2) �ʱ�ȭ �� ������ default���� ��.
		
		for(int i =0;i<sizes.length;i++) {
			System.out.println(sizes[i]);
		}
		
		
		int sizes2[] = {44,55,66,77};	//���� ���� �ʱ�ȭ
		
		for (int i = 0; i < sizes2.length; i++) {
			System.out.println(sizes2[i]);
		}

		
		for (int tmp : sizes2) {
			System.out.println(tmp);
		}
		for (Integer tmp : sizes2) {
			System.out.println(tmp);
		}

	
	}
}
