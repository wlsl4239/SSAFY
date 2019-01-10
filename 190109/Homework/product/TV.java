package com.ssafy.product;

public class TV {
	private String num;
	private String name;
	private int price;
	private int quantity;
	private int inch;
	private String displayType;
	
	public TV(String num) {
		this.num = num;		
	}
	
	public TV(String num, String name, int price, int quantity, int inch, String displayType) {
		setNum(num);
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		setInch(inch);
		setDisplayType(displayType);
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
	public int getInch() {
		return inch;
	}
	public String getDisplayType() {
		return displayType;
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
	private void setInch(int inch) {
		this.inch = inch;
	}
	private void setDisplayType(String displayType) {
		this.displayType = displayType;
	}



	public String toString() {
		return ("제품번호 : " + num + "\n제품명 : " + name + "\n가격 : " + price + "원\n수량 : " + quantity + "개\n크기 : " + inch +" inch"+ "\n디스플레이 타입 : " + displayType);
	}
}
