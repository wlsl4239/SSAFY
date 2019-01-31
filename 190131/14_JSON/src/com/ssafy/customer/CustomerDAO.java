package com.ssafy.customer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CustomerDAO {
	private JsonArray customers = new JsonArray();
	
	public void add(String num,String name,int point) {
		JsonObject cust1 = new JsonObject();
		cust1.addProperty("customerNumber", num);
		cust1.addProperty("Name", name);
		cust1.addProperty("point", point);
		customers.add(cust1);
	}
	public void add(Customer cust) {
		add(cust.getNum(),cust.getName(),cust.getPoint());
	}
	
	public void save() {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("customers.json"));
			oos.writeObject(customers.toString());
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public JsonArray getList() {
		return customers;
	}
}
