package com.ssafy.product;

//제품번호, 제품명, 가격, 재고수량
public class Product {
	private String num;
	private String name;
	private int price;
	private int quantity;
	
	public Product(String num, String name, int price, int quantity) {
		setNum(num);
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "제품번호 : " + num + ", 제품명 : " + name + ", 가격 : " + price + ", 재고수량 : " + quantity;
	}
	
	
	

}
