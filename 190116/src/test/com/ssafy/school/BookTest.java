package test.com.ssafy.school;

import java.util.Arrays;
import java.util.Scanner;

import com.ssafy.book.Book;
import com.ssafy.book.BookManager;
import com.ssafy.book.Magazine;

//1. 데이터 입력기능
//2. 데이터 전체 검색기능
//3. isbn으로 정보를 검색하는 기능
//4. title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)
//5. book만 검색하는 기능
//6. magazine만 검색하는 기능
//7. magazine중 올해 잡지만 검색하는 기능
//(방법 1. 파라메터로 연도 전달받아 검색, 방법2. 올해를 시스템 날짜 이용 파악 후 검색)
//8. 출판사로 검색하는 기능
//9. 가격으로 검색 기능(파라메터로 주어진 가격보다 낮은 도서 정보 검색)
//10. 저장된 모든 도서의 금액 합계를 구하는 기능
//11. 저장된 모든 도서의 금액 평균을 구하는 기능

public class BookTest {/*		UI....
	Scanner sc;
	BookManager bm;

	public BookTest() {
		sc = new Scanner(System.in);
		bm = BookManager.getInstance();
		startUI();
	}


	private void startUI() {

		while(true) {
			printUI();
			String query = sc.nextLine();

			switch(query) {
			case "1":
				addBook();
				break;
			case "2":
				searchAllBooks();
				break;
			case "3":
				searchByIsbn();
				break;
			case "4":
				searchByTitle();
				break;
			case "5":
				searchBooks();
				break;
			case "6":
				searchMagazines();
				break;
			case "7":
				searchMagazinesOfThisYear();
				break;
			case "8":
				searchByPublisher();
				break;
			case "9":
				searchByPrice();
				break;
			case "10":
				totalPrice();
				break;
			case "11":
				averagePrice();
				break;
			case "0":
				exitUI();
				break;
			}

		}

	}


	private void addBook() {


	}


	private void searchAllBooks() {


	}


	private void searchByIsbn() {


	}


	private void searchByTitle() {


	}


	private void searchBooks() {


	}


	private void searchMagazines() {


	}


	private void searchMagazinesOfThisYear() {


	}


	private void searchByPublisher() {


	}


	private void searchByPrice() {


	}


	private void totalPrice() {


	}


	private void averagePrice() {


	}


	private void exitUI() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}

	private void printUI() {
		System.out.println("1.데이터 입력기능\r\n" + 
				"2. 데이터 전체 검색기능\r\n" + 
				"3. isbn으로 정보를 검색하는 기능\r\n" + 
				"4. title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)\r\n" + 
				"5. book만 검색하는 기능\r\n" + 
				"6. magazine만 검색하는 기능\r\n" + 
				"7. magazine중 올해 잡지만 검색하는 기능\r\n" + 
				"(방법 1. 파라메터로 연도 전달받아 검색, 방법2. 올해를 시스템 날짜 이용 파악 후 검색)\r\n" + 
				"8. 출판사로 검색하는 기능\r\n" + 
				"9. 가격으로 검색 기능(파라메터로 주어진 가격보다 낮은 도서 정보 검색)\r\n" + 
				"10. 저장된 모든 도서의 금액 합계를 구하는 기능\r\n" + 
				"11. 저장된 모든 도서의 금액 평균을 구하는 기능\r\n"
				+ "0. 종료"
				+ "메뉴를 입력하세요 : ");
	}

 */
	
	public static void main(String[] args) {
		//		new BookTest();

		BookManager bm;
		bm = BookManager.getInstance();
		
		//1. 데이터 입력기능
		bm.add(new Book("21424","Java Pro","김하나","Jaen.jp",15000,"Java 기본 문법"));
		bm.add(new Book("33455","JDBC Pro","김철수","Jaen.kr",23000));
		bm.add(new Book("55355","Servlet/JSP","박자바","Jaen.kr",41000,"Mode12 기반"));
		bm.add(new Magazine("35535","Java World","편집부","Jaen.kr",7000,2019,2));
		bm.add(new Magazine("33434","Mobile World","편집부","Jaen.kr",8000,2013,8));
		bm.add(new Magazine("75342","Next Web","편집부","Jaen.kr",10000,"AJAX 소개",2019,10));

		//2. 데이터 전체 검색기능
		for(Book b : bm.searchAll()) {
			if(b==null)
				break;
			System.out.println(b);
		}
		System.out.println();

		//3. isbn으로 정보를 검색하는 기능
		System.out.println(bm.searchByIsbn("21424"));
		System.out.println();
		
		//4. title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)
		for(Book b : bm.searchByTitle("Java")) {
			if(b==null)
				break;
			System.out.println(b);
		}
		System.out.println();
		
		//5. book만 검색하는 기능
		for(Book b : bm.searchBooks()) {
			if(b==null)
				break;
			System.out.println(b);
		}
		System.out.println();
		
		//6. magazine만 검색하는 기능
		for(Book b : bm.searchMagazines()) {
			if(b==null)
				break;
			System.out.println(b);
		}
		System.out.println();
		
		//7. magazine중 올해 잡지만 검색하는 기능
		//(방법 1. 파라메터로 연도 전달받아 검색, 방법2. 올해를 시스템 날짜 이용 파악 후 검색)
		for(Book b : bm.searchMagazinesOfThisYear(2019)) {
			if(b==null)
				break;
			System.out.println(b);
		}
		System.out.println();
		
		//8. 출판사로 검색하는 기능
		for(Book b : bm.searchByPublisher("Jaen.kr")) {
			if(b==null)
				break;
			System.out.println(b);
		}
		System.out.println();
		
		//9. 가격으로 검색 기능(파라메터로 주어진 가격보다 낮은 도서 정보 검색)
		for(Book b : bm.searchByPrice(20000)) {
			if(b==null)
				break;
			System.out.println(b);
		}
		System.out.println();
		
		//10. 저장된 모든 도서의 금액 합계를 구하는 기능
		System.out.println("금액 총합 : " + bm.totalPrice());
		//11. 저장된 모든 도서의 금액 평균을 구하는 기능
		System.out.println("금액 평균 : " + bm.averagePrice());
		System.out.println("종료");


	}
}
