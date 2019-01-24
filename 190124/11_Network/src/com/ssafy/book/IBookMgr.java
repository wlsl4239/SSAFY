package com.ssafy.book;

import java.util.List;

public interface IBookMgr {
	public void add(Book b);
	public List<Book> search();
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;
	public void buy(String isbn, int quantity) throws ISBNNotFoundException;
	public int getTotalAmount();
	public void open();
	public void close();
	public void send();
}
