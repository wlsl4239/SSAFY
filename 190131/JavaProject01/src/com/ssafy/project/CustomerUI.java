package com.ssafy.project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class CustomerUI {
	private Scanner sc;
	private CustomerMgrImpl cm;

	public CustomerUI() throws ParserConfigurationException {
		cm = new CustomerMgrImpl();
		sc = new Scanner(System.in);
		while(true) {
			System.out.print("1. 특정 고객 출력(from XML)\n"
					+ "2. JSON으로 저장\n"
					+ "3. 특정 고객정보 검색 후 서버에 전송\n"
					+ "0. 프로그램 종료\n"
					+ "입력 : ");
			String query = sc.nextLine();

			switch(query) {
			case "1":
				getCustomerFromXML();
				break;
			case "2":
				saveJson();
				break;
			case "3":
				searchCustomer();
				break;
			case "0":
				quit();
				break;
			}

		}

	}
	private String getString(String message) {
		System.out.print(message + " : ");
		return sc.nextLine();
	}
	private void getCustomerFromXML() {
		try {
			cm.getCustomerFromXML(getString("회원번호를 입력하세요"));
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void saveJson() {
		cm.saveJson();
	}

	private void searchCustomer() {
		try {
			cm.sendToServer(getString("회원번호를 입력하세요"));
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void quit() {
		System.out.println("프로그램 종료");
		System.exit(0);		
	}

	public static void main(String[] args) throws ParserConfigurationException {
		new CustomerUI();
		System.out.println("END");
	}
}
