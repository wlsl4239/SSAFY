package com.ssafy.car;

public class CarMgr {
	private Car cars[];
	private int index;
	
	public CarMgr() {
		cars = new Car[10];
		index = 0;
	}
	
	public void add(Car c){
		if(index >= 10 || c == null) return;
		if(search(c.getNum()) != null) return;
		
		cars[index] = c;
		index ++;
	}
	public Car[] search() {
		if(index == 0) return null;
		
		Car[] temp = new Car[10];
		for(int i=0;i<index;i++)
			temp[i] = cars[i];
		
		return temp;
	}
	public Car search(String num) {
		Car temp = null;
		
		for(int i=0;i<index;i++)
			if(cars[i].getNum() == num) {
				temp = cars[i];
			}
		return temp;
	}
	
	public Car[] search(int price) {
		
		Car[] temp = new Car[10];
		int count = 0;
		for(int i=0;i<index;i++) {
			if(cars[i].getPrice() < price) {
				temp[count] = cars[i];
				count ++;
			}
		}
		return temp;
		
	}
	public void update(String num,int price) {
		search(num).setPrice(price);
	}
	public void delete(String num) {
		int deleteIndex = 10;
		for(int i=0;i<index;i++) {
			if(cars[i].getNum() == num) {
				deleteIndex = i;
				break;
			}
		}
		
		for(int i=deleteIndex;i<index-1;i++) 
			cars[i] = cars[i+1];
		cars[index-1] = null;
		
		index--;
	}
	public int size() {
		return index;
	}
	public int totalPrice() {
		int totalPrice = 0;
		for(int i=0;i<index;i++)
			totalPrice += cars[i].getPrice();
		return totalPrice;
	}

}
