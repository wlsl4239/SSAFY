
// 2. 클래스는 있지만 uncheckedException		==> 단위테스트를 명확히하자.
// 대표적으로 RuntimeException
// Integer.parseInt("abc") -> java.lang.NumberFormatException -> runtimeException.

public class ExceptionTest_03 {
	public static void main(String[] args) {
		// 문자열을 입력받아 정수로 변환하세요.
		try {
			int num = Integer.parseInt("1234");
			num = Integer.parseInt("abs");
		}catch(NumberFormatException e) { // catch는 작은것 부터 하자.

			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("try든 catch든 마지막에 공통적인 동작을 필요로 할 때 finally를 사용한다.");
			System.out.println("보통은 자원 반환. 로그아웃 등.");
		}

		System.out.println("End");
	}
}


// 컴파일에러는 위에서부터, 런타임에러는 아래서부터 확인하자.