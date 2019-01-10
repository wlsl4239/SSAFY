package test.com.ssafy.book;

import com.ssafy.book.Book;
import com.ssafy.book.Magazine;


public class BookTest {
	public static void main(String[] args) {
		
		Book[] b = new Book[5];
		b[0] = new Book("21424","Java Pro","김하나","Jaen.kr",15000,"Java 기본 문법");
		b[1] = new Book("33455","JDBC Pro","김철수","Jaen.kr",23000);
		b[2] = new Book("55355","Servlet/JSP","박자바","Jaen.kr",41000,"Mode12 기반");
		b[3] = new Book("35332","Android App","홍길동","Jaen.kr",25000,"Lightweight Framework");
		b[4] = new Book("35355","OOAD 분석,설계","소나무","Jaen.kr",30000);
		
		Magazine[] m = new Magazine[5];
		m[0] = new Magazine("35535","Java World","편집부","Jaen.kr",2013,2,7000);
		m[1] = new Magazine("33434","Mobile World","편집부","Jaen.kr",2013,8,8000);
		m[2] = new Magazine("75342","Next Web","편집부","Jaen.kr",2012,10,10000,"AJAX 소개");
		m[3] = new Magazine("76543","Architecture","편집부","Jaen.kr",2010,3,5000,"Java 시스템");
		m[4] = new Magazine("76534","Data Modeling","편집부","Jaen.kr",2012,12,14000);
		
		
		System.out.println("*********************** 도서 목록 **************************");
		for(int i=0;i<5;i++)
			System.out.println(b[i]);
		System.out.println();
		System.out.println("*********************** 잡지 목록 **************************");
		for(int i=0;i<5;i++)
			System.out.println(m[i]);
	}
}
