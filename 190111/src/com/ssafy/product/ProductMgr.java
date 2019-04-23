package com.ssafy.product;

public class ProductMgr {
	
	/*
	 * 상품정보를 객체배열을 활용하여 저장
	 * 상품정보 전체를 검색
	 * 상품번호로 검색
	 * 상품명으로 검색
	 * 상품번호와 가격을 입력 -> 가격변경
	 * 상품번호로 삭제
	 * 전체 재고상품 금액
	 * 
	 */

	
	private Product [] products;
	private int index;
	
	public void add(Product p) {
		if(p == null || index >= 10) return;
		if(searchNum(p.getNum()) != null) return;
		
		products[index] = p;
		index++;
	}
	
	public ProductMgr() {
		products = new Product[10];
	}
	
	public Product[] search() {
		Product[] temp = new Product[index];
		for(int i=0;i<index;i++)
			temp[i] = products[i];
		return temp;
	}
	
	public Product searchNum(String num) {
		Product temp = null;
		
		for(int i=0;i<index;i++)
			if(products[i].getNum().equals(num)) {
				temp = products[i];
				break;
			}
		
		return temp;
	}
	
	public Product searchName(String name) {
		Product temp = null;
		for(int i=0;i<index;i++)
			if(products[i].getName().equals(name)) {
				temp = products[i];
				break;
			}
		
		return temp;
		
	}
	public void setPrice(String num,int price) {
		for(int i=0;i<index;i++)
			if(products[i].getNum().equals(num)) {
				products[i].setPrice(price);
				return;
			}
	}
	public void deleteProduct(String num) {
		int idx = 10;
		for(int i=0;i<index;i++)
			if(products[i].getNum().equals(num)) {
				idx = i;
				break;
			}
		
		for(int i=idx;i<index-1;i++)
			products[i] = products[i+1];
		products[index-1] = null;
		
		index--;
		
	}
	public int totalPrice() {
		int totalPrice = 0;
		for(int i=0;i<index;i++)
			totalPrice += products[i].getQuantity() * products[i].getPrice();
		return totalPrice;
	}
	

}
