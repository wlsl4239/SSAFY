package com.ssafy.movie;
/**특정 고객이 로그인 후에 다양한 형태의 티켓을 구입할 수 있다.*/
public class CustomerReservationManager {
	private Customer customer;
	private Reservation[] list = new Reservation[10];
	/**이 객체를 사용하기 위해서 로그인은 필수다.*/
	//생성자
	
	private int count = 0;
	
	public CustomerReservationManager(Customer customer) {
		this.customer = customer;
		//list = new Reservation[10];
	}
	
	/**영화 예매를 추가할 수 있다.*/
	public boolean addReservation(Reservation r) {
		//로그인 여부 체크
		if(customer.getId() == null || customer == null ||
				r == null || count > 9) 
			return false;
		
			
		//예매한 내용 추가
		list[count] = r;
		count++;
		return true;
				
	}
	/**예매한 모든 영화 정보를 확인 할 수 있다.*/
	public Reservation[] getList() {
		return list;
	}



}
