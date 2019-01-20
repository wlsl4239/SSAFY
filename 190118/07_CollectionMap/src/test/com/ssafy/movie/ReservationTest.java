package test.com.ssafy.movie;

import java.util.Scanner;
import com.ssafy.movie.*;

public class ReservationTest {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Reservation r = new Reservation();
		Movie mv1 = new Movie("쿵푸팬더","1400");
		Movie mv2 = new Movie("쿵푸팬더2","1430");
		Movie mv3 = new Movie("포켓몬스터","1130");
		Member mb1 = new Member("1111","최씨"); 
		Member mb2 = new Member("2222","박씨"); 
		Member mb3 = new Member("3333","김씨"); 
		
		r.reserve(mb1, mv1);
		r.reserve(mb2, mv1);
		r.reserve(mb3, mv2);
		
		
		for (Object m : r.getMemberMgr().search()) {
			System.out.println(m);
		}
		System.out.println();
		
	}
}
