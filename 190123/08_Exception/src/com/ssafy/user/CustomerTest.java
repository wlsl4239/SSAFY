package com.ssafy.user;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer c = null;
		try {
			c = new Customer("홍");
		} catch (CustomerNameLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c);
		
		System.out.println("END");
	}
}
