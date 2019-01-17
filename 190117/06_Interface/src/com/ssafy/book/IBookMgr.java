package com.ssafy.book;

import java.util.Collection;

public interface IBookMgr {
//	1. 데이터 입력기능
	boolean add(Book b);
//	2. 데이터 전체 검색기능
	Collection<Book> searchAll();
//	3. isbn으로 정보를 검색하는 기능	
	Book searchByIsbn(String isbn);
//	4. title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)
	Collection<Book> searchByTitle(String title);
//	5. book만 검색하는 기능
	Collection<Book> searchBooks();
//	6. magazine만 검색하는 기능
	Collection<Magazine> searchMagazines();
//	7. magazine중 올해 잡지만 검색하는 기능
	Collection<Magazine> searchMagazinesOfThisYear(int year);
//	8. 출판사로 검색하는 기능
	Collection<Book> searchByPublisher(String publisher);
//	9. 가격으로 검색 기능(파라메터로 주어진 가격보다 낮은 도서 정보 검색)
	Collection<Book> searchByPrice(int price);
//	10. 저장된 모든 도서의 금액 합계를 구하는 기능
	int totalPrice();
//	11. 저장된 모든 도서의 금액 평균을 구하는 기능
	double averagePrice();
}
