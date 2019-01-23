
//
class UserClass{
	public UserClass() throws ClassNotFoundException {
		methodA();
		System.out.println("생성자");
	}

	private void methodA() throws ClassNotFoundException {
		Class.forName("String");
		System.out.println("MethodA");
		
	}
	
}

public class ExceptionTest_05 {
	public static void main(String[] args) {
		try {
			new UserClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}

// throw의 마지막이거나 UI코드에서는 try-catch를 사용하는걸 권장함.
// 죽기직전에만 살리자.