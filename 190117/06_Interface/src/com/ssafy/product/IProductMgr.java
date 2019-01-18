package com.ssafy.product;

import java.util.Collection;

public interface IProductMgr {
	
	
	
	//	0. 상품정보를 객체배열을 활용하여 저장
	public boolean add(Product p);
	//1. 상품 전체를 검색
	public Collection<Product> searchAll();
	//	2. 상품 번호로 상품을 검색
	public Product searchByNum(String num);
	//	3. 상품명으로 상품을 검색(부분검색 가능)
	public Collection<Product> searchByName(String name);
	//	4. TV정보만 검색
	public Collection<Product> searchTV();
	//	5. Refrigerator만 검색
	public Collection<Product> searchRefrigerator();
	//	6. 400L 이상의 refrigerator 검색
	public Collection<Product> searchRefrigeratorByCapacity(int num);
	//	7. 50inch 이상의 TV 검색
	public Collection<Product> searchTVByInch(int inch);
	//	8. 상품번호와 가격을 입력받아 상품가격을 변경할수 있는 기능
	public void setProductPrice(String num,int price);
	//	9. 상품번호로 상품을 삭제하는 기능
	public void deleteProduct(String num);
	//	10. 전체 재고상품 금액을 구하는 기능
	public int totalPrice() ;
	
}
