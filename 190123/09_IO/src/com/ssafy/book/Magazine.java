package com.ssafy.book;

public class Magazine extends Book {

	private int month;
	public Magazine(String isbn, String title, int price, int quantity,int month) {
		super(isbn, title, price, quantity);
		setMonth(month);
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", month=");
		builder.append(month);
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + month;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (month != other.month)
			return false;
		return true;
	}
	

}
