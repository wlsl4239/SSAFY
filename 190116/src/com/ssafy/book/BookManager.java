package com.ssafy.book;

public class BookManager {
	private Book[] list = new Book[10];
	private int listIndex;
	private static BookManager bm;
	
	public static BookManager getInstance() {
		if(bm == null)
			bm = new BookManager();
		return bm;
	}
	
//	1. 데이터 입력기능
	public void add(Book b) {
		if(listIndex >= 10 || b == null)
			return;
		list[listIndex++] = b;
	}
	
//	2. 데이터 전체 검색기능
	public Book[] searchAll() {
		Book[] books = new Book[10];
		
		for(int i=0;i<listIndex;i++)
			books[i] = list[i];
		
		return books;
		
	}
//	3. isbn으로 정보를 검색하는 기능
	public Book searchByIsbn(String isbn) {
		Book temp = null;
		
		for(int i=0;i<listIndex;i++) {
			if(list[i].getIsbn().equals(isbn)) {
				temp = list[i];
			}
		}	
		return temp;
	}
	
//	4. title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)
	public Book[] searchByTitle(String title) {
		Book[] temp = new Book[10];
		int count = 0;
		for(int i=0;i<listIndex;i++) {
			if(list[i].getTitle().contains(title)) {
				temp[count] = list[i];
				count++;
			}
		}	
		return temp;
	}	
//	5. book만 검색하는 기능
	public Book[] searchBooks() {
		Book[] temp = new Book[10];
		int count = 0;
		for(int i=0;i<listIndex;i++) {
			if(!(list[i] instanceof Magazine)) {
				temp[count] = list[i];
				count++;
			}
		}	
		return temp;
	}
//	6. magazine만 검색하는 기능
	public Magazine[] searchMagazines() {
		Magazine[] temp = new Magazine[10];
		int count = 0;
		for(int i=0;i<listIndex;i++) {
			if(list[i] instanceof Magazine) {
				temp[count] = (Magazine)list[i];
				count++;
			}
		}	
		return temp;
	}
//	7. magazine중 올해 잡지만 검색하는 기능
//	(방법 1. 파라메터로 연도 전달받아 검색, 방법2. 올해를 시스템 날짜 이용 파악 후 검색)
	public Magazine[] searchMagazinesOfThisYear(int year) {
		Magazine[] magazines = new Magazine[10];
		int count = 0;
		for(int i=0;i<listIndex;i++) {
			if(list[i] instanceof Magazine) {
				
				Magazine temp = (Magazine)list[i];
				if(temp.getYear() == year) {
					magazines[count] = temp;
					count++;
				}
			}
		}	
		return magazines;
	}
//	8. 출판사로 검색하는 기능
	public Book[] searchByPublisher(String publisher) {
		Book[] temp = new Book[10];
		int count = 0;
		for(int i=0;i<listIndex;i++) {
			if(list[i].getPublisher().equals(publisher)) {
				temp[count] = list[i];
				count++;
			}
		}	
		return temp;
	}		
	
//	9. 가격으로 검색 기능(파라메터로 주어진 가격보다 낮은 도서 정보 검색)
	public Book[] searchByPrice(int price) {
		Book[] temp = new Book[10];
		int count = 0;
		for(int i=0;i<listIndex;i++) {
			if(list[i].getPrice() < price) {
				temp[count] = list[i];
				count++;
			}
		}	
		return temp;
	}	
//	10. 저장된 모든 도서의 금액 합계를 구하는 기능
	public int totalPrice() {
		int totalPrice = 0;
		for(int i=0;i<listIndex;i++)
			totalPrice += list[i].getPrice();
		
		return totalPrice;
	}
//	11. 저장된 모든 도서의 금액 평균을 구하는 기능
	public double averagePrice() {
		return (double)totalPrice()/listIndex;
	}
	

}
