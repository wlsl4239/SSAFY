package com.ssafy.customer;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CustomerJsonMain {
	private JsonArray customers;
	private Scanner sc;
	private CustomerDAO dao;
	
	public CustomerJsonMain() throws IOException {
		customers = new JsonArray();
		sc = new Scanner(System.in);
		dao = new CustomerDAO();
		while(true) {
			System.out.println("1. 입력\n2. json저장\n0. 종료");
			System.out.print("메뉴 입력 : ");
			String query = sc.nextLine();
			switch(query) {
			case "1" :
				addCustomer();
				break;
			case "2" :
				saveJson();
				break;
			case "0" :
				System.exit(0);
			}
		}
	}

	private String getString(String question) {
		System.out.print(question + " : ");
		return sc.nextLine();
	}
	private void saveJson()  {
		dao.save();
	}

	private void addCustomer() {
//		dao.add(getString("회원번호를 입력하세요")	,
//				getString("이름을 입력하세요"),
//				Integer.parseInt(getString("포인트를 입력하세요")));
		dao.add(new Customer(getString("회원번호를 입력하세요"),
				getString("이름을 입력하세요"),
				Integer.parseInt(getString("포인트를 입력하세요"))
				));
		
	}

	public static void main(String[] args) throws IOException {		
		new CustomerJsonMain();
	}

}
