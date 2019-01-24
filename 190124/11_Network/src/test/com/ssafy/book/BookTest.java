package test.com.ssafy.book;

import com.ssafy.book.Book;
import com.ssafy.book.BookMgrImpl;
import com.ssafy.book.ISBNNotFoundException;
import com.ssafy.book.Magazine;
import com.ssafy.book.QuantityException;

public class BookTest {
	public static void main(String[] args) {
		BookMgrImpl bmi = new BookMgrImpl();
		
		bmi.add(new Book("21424","Java Pro",15000,2));
		bmi.add(new Book("33455","JDBC Pro",23000,5));
		bmi.add(new Book("55355","Servlet/JSP",41000,6));
		bmi.add(new Magazine("35535","Java World",7000,19,2));
		bmi.add(new Magazine("33434","Mobile World",8000,13,8));
		bmi.add(new Magazine("75342","Next Web",10000,9,10));
		
		
		for(Book b : bmi.search())
			System.out.println(b);
		System.out.println();
		System.out.println(bmi.getTotalAmount());
		System.out.println();
		
		try {
			bmi.buy("21424", 1);
		} catch (ISBNNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Book b : bmi.search())
			System.out.println(b);
		System.out.println();
		System.out.println(bmi.getTotalAmount());
		System.out.println();
		
		try {
			bmi.sell("35535", 2);
		} catch (QuantityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ISBNNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Book b : bmi.search())
			System.out.println(b);
		System.out.println();
		
		System.out.println(bmi.getTotalAmount());
		System.out.println();
				
		new Thread() {
			@Override
			public void run() {
				bmi.send();
			}
		}.start();
		
//		bmi.close();
	}
}
