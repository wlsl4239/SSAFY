package com.ssafy.type;
//반복문 - 배열 - 같은 자료형을 연속적인 메모리에 넣고 반복문으로 처리
//요구사항 : 사이즈는 44, 55, 66, 77 까지 입니다.
public class LoopTest_02 {
	public static void main(String[] args) {
		int sizes[];		// 선언
		sizes = new int[4];	// new사용 => 객체, 고정 길이만 사용가능. -> heap
							// heap 특징 1) 사이즈 변경불가. 2) 초기화 값 없으면 default값이 들어감.
		
		for(int i =0;i<sizes.length;i++) {
			System.out.println(sizes[i]);
		}
		
		
		int sizes2[] = {44,55,66,77};	//선언 생성 초기화
		
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
