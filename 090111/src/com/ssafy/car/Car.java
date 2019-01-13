package com.ssafy.car;

public class Car {
	private String num;
	private String model;
	private int price;
	
	public Car() {};
	public Car(String num, String model, int price) {
		setNum(num);
		setModel(model);
		setPrice(price);
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "num=" + num + ", model=" + model + ", price=" + price;
	}
	
	
}
