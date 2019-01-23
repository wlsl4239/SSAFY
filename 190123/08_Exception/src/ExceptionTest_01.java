
//1. 클래스가 없는 uncheckedException  ==> 단위테스트를 명확하게 해야한다.

public class ExceptionTest_01 {
	public static void main(String[] args) {
		char[] sizes = {'M','L'};

		for(int i=-1;i<3;i++) {
			try {
				System.out.println(sizes[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
//				예외 정보를 확인
				e.printStackTrace();
			}
		}

		System.out.println("End");
	}
}

// 최소한으로 안전장치를 하게되면 속도는 빠르다.
// 