package com.ssafy.book;

public class Magazine extends Book {

	private int year;
	private int month;
	
	public Magazine(String isbn, String title, String author, String publisher, int price, String desc,int year,int month) {
		super(isbn,title,author,publisher,price,desc);
		setYear(year);
		setMonth(month);
	}
	public Magazine(String isbn, String title, String author, String publisher, int price, int year,int month) {
		super(isbn,title,author,publisher,price,"");
		setYear(year);
		setMonth(month);
	}	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\t| ");
		sb.append(year);
		sb.append(".");
		sb.append(month);
		
		return sb.toString();
		
	}
	
}
