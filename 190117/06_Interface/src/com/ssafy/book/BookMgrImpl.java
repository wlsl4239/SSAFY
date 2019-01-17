package com.ssafy.book;

import java.util.ArrayList;
import java.util.Collection;

import com.ssafy.book.Book;
import com.ssafy.book.Magazine;

public class BookMgrImpl implements IBookMgr {
	Collection<Book> books;
	
	public BookMgrImpl() {
		this.books = new ArrayList();
	}

	@Override
	public boolean add(Book b) {
		return books.add(b);
	}

	@Override
	public Collection<Book> searchAll() {
		/*
		Collection<Book> list = new ArrayList();
		for (Book book : books) {
			Book temp = book;
			list.add(temp);
		}
		return list;
		*/
		return books;
	}

	@Override
	public Book searchByIsbn(String isbn) {
		for (Book book : books) 
			if(book.getIsbn().equals(isbn))
				return book;
				
		return null;
	}

	@Override
	public Collection<Book> searchByTitle(String title) {
		Collection<Book> temp = new ArrayList();
		
		for (Book book : books) 
			if(book.getTitle().contains(title))
				temp.add(book);
				
		return temp;
	}

	@Override
	public Collection<Book> searchBooks() {
		Collection<Book> temp = new ArrayList();
		for (Book book : books) 
			if(!(book instanceof Magazine))
				temp.add(book);
		
		return temp;
	}

	@Override
	public Collection<Magazine> searchMagazines() {
		Collection<Magazine> temp = new ArrayList();
		for (Book book : books) 
			if(book instanceof Magazine)
				temp.add((Magazine)book);
		
		return temp;
	}

	@Override
	public Collection<Magazine> searchMagazinesOfThisYear(int year) {
		Collection<Magazine> temp = new ArrayList();
		for (Book book : books) 
			if(book instanceof Magazine)
				if(((Magazine) book).getYear() == year)
					temp.add((Magazine)book);
		
		return temp;
	}

	@Override
	public Collection<Book> searchByPublisher(String publisher) {
		Collection<Book> temp = new ArrayList();
		for (Book book : books) 
			if(book.getPublisher().equals(publisher))
				temp.add(book);
		return temp;
	}

	@Override
	public Collection<Book> searchByPrice(int price) {
		Collection<Book> temp = new ArrayList();
		for (Book book : books) 
			if(book.getPrice()<price)
				temp.add(book);
			
		return temp;
	}

	@Override
	public int totalPrice() {
		int totalPrice = 0;
		
		for (Book book : books) 
			totalPrice += book.getPrice();	
		return totalPrice;
	}

	@Override
	public double averagePrice() {
		return (double)totalPrice()/books.size();
	}
}
