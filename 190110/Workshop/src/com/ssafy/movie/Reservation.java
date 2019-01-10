package com.ssafy.movie;

/*업무 분석 data --- operation*/
public class Reservation {
	// 1. 일반적으로 멤버 데이터는 private 권장.
	private String type;
	private int quantity;
	
	// 3. 생성자 => 초기화(heap 메모리에 할당할 때 초기화.)
	// 매개인자가 다양한 생성자가 필요한지 여부 결정. ==> overloading
	private Reservation() {
		System.out.println("사용자 정의로 구현부 변경 ex) Thread 생성자");
	}	//매개인자 없는 생성자는 선택.
	public Reservation(String type, int quantity) {
		this.type = type;
		this.quantity = quantity;
	}

	// 2. -멤버데이터를 접근 값을 넣거나, 값을 빼 오거나. -> getXxx setXxx -> 일관성 => 패턴.
	// 재사용율이 높을려면 작은 단위로 메서드를 정의.
	public void setType(String type) {	
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	
	// 업무에 필요한 메서드
	// 출력한다.
	public void print() {
		System.out.println(type + " "+ quantity + " 장 ");
	}

	public String toString() {
		return (type + " "+ quantity + " 장 ");
	}
}




