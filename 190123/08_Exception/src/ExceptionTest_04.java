
// 3. checkedException 
// ex) ClassNotFoundException
// 컴파일러가 오류 상황을 컴파일 단계에서 체크한다.

public class ExceptionTest_04 {
	public static void main(String[] args) {
		//new String()
		try {
			Class.forName("java.lang.String");
			Class.forName("String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}

// exception은 개발자, 보안담당자에게 중요하지만 사용자에게 노출되면 안된다.
