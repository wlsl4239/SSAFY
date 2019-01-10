package test.com.ssafy.movie;

import com.ssafy.movie.*;
public class CRMTest {
	public static void main(String[] args) {
		CustomerReservationManager crm = 
				new CustomerReservationManager(new Customer("kim","1234"));
		Reservation[] list = crm.getList();
		
		crm.addReservation(new Reservation("초등",10));
		crm.addReservation(new Reservation("일반",5));
		
		for(Reservation r:list)
			if(r != null)
				System.out.println(r);
	}
}
