package com.ssafy.product;

public class TV extends Product {
	private int inch;
	private String displayType;
	
	
	public TV(String num, String name, int price, int quantity, int inch, String displayType) {
		super(num,name,price,quantity);
		setInch(inch);
		setDisplayType(displayType);
	}


	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}


	public String getDisplayType() {
		return displayType;
	}


	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 크기 : ");
		builder.append(inch);
		builder.append("inch, 디스플레이 종류 : ");
		builder.append(displayType);
		return builder.toString();
	}


}
