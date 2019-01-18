package com.ssafy.product;

public class Refrigerator extends Product {
	private int capacity;
	
	public Refrigerator(String num, String name, int price, int quantity, int capacity) {
		super(num,name,price,quantity);
		setCapacity(capacity);
	}
	public int getCapacity() {
		return capacity;
	}	
	private void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 용량 : ");
		builder.append(capacity);
		builder.append("L");
		return builder.toString();
	}

}
