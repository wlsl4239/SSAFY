package com.ssafy.book;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;


public class BookMgrImpl implements IBookMgr {

	List<Book> list;

	public BookMgrImpl() {
		list = new ArrayList();
//		open();
	}

	@Override
	public void add(Book b) {
		list.add(b);
	}

	@Override
	public List<Book> search() {
		return list;
	}

	@Override
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {
		Book temp = null;
		for (Book book : list) {
			if(book.getIsbn().equals(isbn)) {
				temp = book;
				break;
			}
		}
		if(temp == null)
			throw new ISBNNotFoundException(isbn);
		else if(temp.getQuantity() < quantity)
			throw new QuantityException(Integer.toString(quantity));
		temp.setQuantity(temp.getQuantity() - quantity);
	}

	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException {
		Book temp = null;
		for (Book book : list) {
			if(book.getIsbn().equals(isbn)) {
				temp = book;
				break;
			}
		}
		if(temp==null)
			throw new ISBNNotFoundException(isbn);
		temp.setQuantity(temp.getQuantity() + quantity);

	}

	@Override
	public int getTotalAmount() {
		int totalAmount = 0;
		for (Book book : list) {
			totalAmount += book.getQuantity()*book.getPrice();
		}
		return totalAmount;
	}

	@Override
	public void open() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));
			while(true) {
				Book u1 = (Book)ois.readObject();
				System.out.println(u1);
				list.add(u1);
			}
		} catch(EOFException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void close() {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
			for(Book uo : list)
				oos.writeObject(uo);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void send() {
		new BookClient();
	}
	
	class BookClient implements Runnable {
		
		public BookClient() {
			run();
		}
		public void run() {
			try {
				Socket socket = new Socket("127.0.0.1",8888);

				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(list);
				oos.flush();
				oos.close();

			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}