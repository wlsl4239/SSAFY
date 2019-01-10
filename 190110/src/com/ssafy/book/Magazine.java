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
		setIsbn(isbn);//this.isbn = isbn;
		setTitle(title);//this.title = title;
		setAuthor(author);//this.author = author;
		setPublisher(publisher);//this.publisher = publisher;
		setYear(year);//this.year = year;
		setMonth(month);//this.month = month;
		setPrice(price);//this.price = price;
		setDesc(desc);//this.desc = desc;
	}
	public Magazine(String isbn, String title, String author, String publisher, int year, int month, int price) {
		this(isbn,title,author,publisher,year,month,price,"");
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
		return (isbn + "\t| " + title + "\t| " + author + "\t| " + publisher + "\t| " + price + "\t| " + desc+ "\t| "+year+"."+month);
	}
}
