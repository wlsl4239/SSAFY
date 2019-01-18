package com.ssafy.product;

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
		StringBuilder builder = new StringBuilder();
		builder.append("제품번호 : ");
		builder.append(num);
		builder.append(", 제품명 : ");
		builder.append(name);
		builder.append(", 가격 : ");
		builder.append(price);
		builder.append(", 재고수량 : ");
		builder.append(quantity);
		return builder.toString();
	}
	
	
}
