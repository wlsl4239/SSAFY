package test.com.ssafy.school;

import com.ssafy.school.Person;

public class ObjectTest {
	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "hi";
		String s3 = new String("hi");
		String s4 = new String("hi");
		String s5 = s4;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s5==s4);
		
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		Person p3 = p2;
		
		System.out.println(p1.equals(p2));
		System.out.println(p3==p2);
	}
}
