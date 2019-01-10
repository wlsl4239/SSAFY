package com.ssafy.product;

public class Refrigerator {
	private String num;
	private String name;
	private int price;
	private int quantity;
	private int capacity;
	
	public Refrigerator(String num) {
		this.num = num;		
	}
	
	public Refrigerator(String num, String name, int price, int quantity, int capacity) {
		setNum(num);
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		setCapacity(capacity);
	}

	public String getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getCapacity() {
		return capacity;
	}	
	
	
	private void setNum(String num) {
		this.num = num;
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setPrice(int price) {
		this.price = price;
	}
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	public String toString() {
		return ("제품번호 : " + num + "\n제품명 : " + name + "\n가격 : " + price + "원\n수량 : " + quantity + "개\n용량 : " + capacity + "l");
	}
}
