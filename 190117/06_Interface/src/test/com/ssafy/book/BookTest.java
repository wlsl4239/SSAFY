package test.com.ssafy.book;

import com.ssafy.book.Book;
import com.ssafy.book.BookMgrImpl;
import com.ssafy.book.Magazine;

public class BookTest {
	public static void main(String[] args) {


		BookMgrImpl bm = new BookMgrImpl();	

		System.out.println("1. 데이터 입력기능");

		bm.add(new Book("21424","Java Pro","김하나","Jaen.jp",15000,"Java 기본 문법"));
		bm.add(new Book("33455","JDBC Pro","김철수","Jaen.jp",23000));
		bm.add(new Book("55355","Servlet/JSP","박자바","Jaen.kr",41000,"Mode12 기반"));
		bm.add(new Magazine("35535","Java World","편집부","Jaen.kr",7000,2019,2));
		bm.add(new Magazine("33434","Mobile World","편집부","Jaen.kr",8000,2013,8));
		bm.add(new Magazine("75342","Next Web","편집부","Jaen.jp",10000,"AJAX 소개",2019,10));

		System.out.println("2. 데이터 전체 검색기능");
		for (Book b : bm.searchAll()) {
			System.out.println(b);
		}

		System.out.println("3. isbn으로 정보를 검색하는 기능");
		System.out.println(bm.searchByIsbn("21424"));
		System.out.println(bm.searchByIsbn("35535"));
		
		System.out.println("4. title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)");
		for (Book b : bm.searchByTitle("Java")) {
			System.out.println(b);
		}
		
		System.out.println("5. book만 검색하는 기능");
		for (Book b : bm.searchBooks()) {
			System.out.println(b);
		}
		
		System.out.println("6. magazine만 검색하는 기능");
		for (Magazine b : bm.searchMagazines()) {
			System.out.println(b);
		}
		
		System.out.println("7. magazine중 올해 잡지만 검색하는 기능");
		for (Magazine b : bm.searchMagazinesOfThisYear(2019)) {
			System.out.println(b);
		}
		
		
		System.out.println("8. 출판사로 검색하는 기능");
		for (Book b : bm.searchByPublisher("Jaen.kr")) {
			System.out.println(b);
		}
		
		
		System.out.println("9. 가격으로 검색 기능(파라메터로 주어진 가격보다 낮은 도서 정보 검색)");

		for (Book b : bm.searchByPrice(20000)) {
			System.out.println(b);
		}
		
		System.out.println("10. 저장된 모든 도서의 금액 합계를 구하는 기능");
		System.out.println(bm.totalPrice());
		
		System.out.println("11. 저장된 모든 도서의 금액 평균을 구하는 기능");
		System.out.println(bm.averagePrice());
		
		
	}
}
