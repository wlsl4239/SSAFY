package com.ssafy.book;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;

	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		setIsbn(isbn);
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setPrice(price);
		setDesc(desc);
	}
	public Book(String isbn, String title, String author, String publisher, int price) {
		this(isbn,title,author,publisher,price,"");
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
		StringBuilder sb = new StringBuilder();
		sb.append(isbn);
		sb.append("\t| ");
		sb.append(title);
		sb.append("\t| ");
		sb.append(author);
		sb.append("\t| ");
		sb.append(publisher);
		sb.append("\t| ");
		sb.append(price);
		sb.append("\t| ");
		sb.append(desc);
		
		return sb.toString();
	}
}
