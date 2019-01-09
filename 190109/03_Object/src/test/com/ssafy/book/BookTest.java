package test.com.ssafy.book;

import com.ssafy.book.*;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("21424","Java Pro","김하나","Jaen.kr",15000,"Java 기본 문법");
		Book b2 = new Book("35355","분석 설계","소나무","Jaen.kr",30000,"SW 모델링");
		Magazine m1 = new Magazine("35535","Java World","편집부","Java.com",2018,2,7000,"첫걸음");
		
		
		System.out.println("*********************** 도서 목록 **************************");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(m1.toString());
	}
}
