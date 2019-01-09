package com.ssafy.book;

public class Magazine {
	//data
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int month;
	private int price;
	private String desc;

	//constructor
//	public Magazine() {};
	public Magazine(String isbn, String title, String author, String publisher, int year, int month, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.month = month;
		this.price = price;
		this.desc = desc;
	}
	public Magazine(String isbn) {
		this.isbn = isbn;
	}

	//method
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getPrice() {
		return price;
	}
	public String getDesc() {
		return desc;
	}


	private void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private void setAuthor(String author) {
		this.author = author;
	}
	private void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	private void setYear(int year) {
		this.year = year;
	}
	private void setMonth(int month) {
		this.month = month;
	}
	private void setPrice(int price) {
		this.price = price;
	}
	private void setDesc(String desc) {
		this.desc = desc;
	}


	public String toString() {
		return (isbn + "\t| " + title + "\t| " + author + "\t| " + publisher + "\t| " + price + "\t| " + desc+ "\t\t| "+year+"."+month);
	}
}
