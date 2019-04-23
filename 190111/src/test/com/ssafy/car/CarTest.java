package test.com.ssafy.car;

import java.util.Arrays;

import com.ssafy.car.Car;
import com.ssafy.car.CarMgr;

public class CarTest {
	public static void main(String[] args) {
		CarMgr cm = new CarMgr();
		
		cm.add(new Car("1234","ABC",500000));
		cm.add(new Car("1111","AAA",800000));
		cm.add(new Car("1515","BBB",900000));
		cm.add(new Car("2222","CCC",300000));
		
		System.out.println("전체검색");
		for(int i=0;i<cm.search().length;i++) {
			if(cm.search()[i] == null)
				break;
			System.out.println(cm.search()[i]);
		}
		
		cm.update("1234", 1200000);
		
		System.out.println("사이즈");
		System.out.println(cm.size());
		System.out.println("전체검색(업데이트 후)");
		for(int i=0;i<cm.search().length;i++) {
			if(cm.search()[i] == null)
				break;
			System.out.println(cm.search()[i]);
		}
		
		System.out.println("사이즈");
		System.out.println(cm.size());
		
		System.out.println("부분검색(60만 미만)");
		for(int i=0;i<cm.search(600000).length;i++) {
			if(cm.search(600000)[i] == null)
				break;
			System.out.println(cm.search(600000)[i]);
		}
		
		System.out.println("특정검색(1111번)");
		System.out.println(cm.search("1111"));
	
		System.out.println("차량삭제(1234번) 후");
		cm.delete("1234");
		
		
		for(int i=0;i<cm.search().length;i++) {
			if(cm.search()[i] == null)
				break;
			System.out.println(cm.search()[i]);
		}
		
		System.out.println("삭제 후 사이즈");
		System.out.println(cm.size());
		
		
		cm.add(new Car("5555","DDD",3100000));
		cm.add(new Car("7777","EEE",3400000));
		
		System.out.println("추가 후 사이즈");
		System.out.println(cm.size());		
		
		System.out.println("전체검색");
		for(int i=0;i<cm.search().length;i++) {
			if(cm.search()[i] == null)
				break;
			System.out.println(cm.search()[i]);
		}

		System.out.println("중복값 추가");

		cm.add(new Car("5555","DDD",2900000));
		System.out.println("추가 후 사이즈");
		cm.add(new Car("5555","DDD",3100000));
		cm.add(new Car("7777","EEE",3400000));
		
		System.out.println(cm.size());		
		System.out.println("전체검색");
		for(int i=0;i<cm.search().length;i++) {
			if(cm.search()[i] == null)
				break;
			System.out.println(cm.search()[i]);
		}
	}
}
