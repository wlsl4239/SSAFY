package test.com.ssafy.movie;

import com.ssafy.movie.Reservation;

public class ReservationTest {

	public static void main(String[] args) {
		//입력  ==> 멤버 데이터
		//Reservation r1 = new Reservation();

		Reservation r1 = new Reservation("초등학생",8);
		//r1.setType("청소년");
		//r1.setQuantity(10);
		//처리 ==> 예매정보입력(), 결과확인()
		
		//출력
		r1.print();
	}
}
