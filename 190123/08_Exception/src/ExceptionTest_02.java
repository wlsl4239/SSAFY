
//1. 클래스가 없는 uncheckedException  ==> 단위테스트를 명확하게 해야한다.

public class ExceptionTest_02 {
	public static void main(String[] args) {
		char[] sizes = {'M','L'};

		try {
			for(int i=-1;i<3;i++) {
				System.out.println(sizes[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//				예외 정보를 확인
			e.printStackTrace();
		}

		System.out.println("End");
	}
}

// "작업단위"로 묶는것이 좋다.
// 