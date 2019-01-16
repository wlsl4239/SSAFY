package test.com.ssafy.school;

import com.ssafy.school.*;

//자바에서 상속은 클래스 간에 1:1 필수관계


public class OOPTest {
	public static void main(String[] args) {
		
	Person p1 = new Person("홍길동");
	System.out.println(p1);
	Student s1 = new Student("s001","김경수");
	System.out.println(s1);
	Person p2 = new Student("s002","이순신");
	//Student s2 = new Person("김박사");//선언은 생성보다 같거나 커야 한다.
	//p1, p2가 선언타입은 구현부는 다르다. ==> 다형성
	
	
	
	}
}
