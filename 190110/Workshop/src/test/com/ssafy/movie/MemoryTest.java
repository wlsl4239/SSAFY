package test.com.ssafy.movie;

import com.ssafy.movie.Customer;

/* 
 * 대상 소스코드 ---> test
 * 대상 소스코드 <-- test로부터 추론 : TDD -> 업무가 추상적일 때 Interface(Input-Process-Out)를 추출할 때 효과적
 * 고객은 자신의 이름과 포인트를 확인 할 수 있다.
 * 고객은 아이디와 비밀번호로 로그인 한다.
 * 이름확인(), 포인트확인(), 로그인() - 고객등록
 */

public class MemoryTest {
	public static void main(String[] args) {
		char c1 = 'h';							// character 형 변수
		char[] c2 = {'h','i'};					// char 배열 선언
		String s1 = "hi";						// String  Literal 선언
		String s2 = s1;							// 
		String s3 = new String("hi");			// String  Object 선언
		String s4 = s3;							// 
		char[] c3 = c2;							// 
		Customer cust1 = new Customer();		// Customer  Object 선언
		Customer cust2 = cust1;					// 
		
		cust1 = null;
		cust2 = new Customer();
		
		cust1 = cust2;
//		System.out.println(cust1.getName());
//		System.out.println(cust2.getName());
//		cust2.setName("김");
//		System.out.println(cust1.getName());
//		System.out.println(cust2.getName());
		
//		System.out.println(c1 == c2);
		System.out.println("c1 : " + c1);
		System.out.println("c3 == c2 : " + (c3 == c2));
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("cust1 == cust2 : " + (cust1 == cust2));
		System.out.println(cust1);
		System.out.println(cust2);
		
//		System.out.println("cust1.getName() == s1 : " + (cust1.getName() == s1));
		
//		System.out.println(s1.toCharArray() == c2);
		
//		Customer c = new Customer();
//		boolean result = c.login("id","pw");
//		System.out.println(result);
//		result = c.login("kim","1234");
//		System.out.println(result);
//		
//		System.out.println(c.getName());
//		System.out.println(c.getPoint());
//		
//		
//		Customer c2 = new Customer();
//		System.out.println(c2.getName());
//		System.out.println(c2.getPoint());
		
	}

}
