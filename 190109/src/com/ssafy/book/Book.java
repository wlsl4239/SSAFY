package com.ssafy.book;

public class Book {
	//data
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;

	//constructor
//	public Book() {}
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public Book(String isbn) {
		this.isbn = isbn;
	}

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
	private void setPrice(int price) {
		this.price = price;
	}
	private void setDesc(String desc) {
		this.desc = desc;
	}


	public String toString() {
		return (isbn + "\t| " + title + "\t| " + author + "\t| " + publisher + "\t| " + price + "\t| " + desc);
	}
}
