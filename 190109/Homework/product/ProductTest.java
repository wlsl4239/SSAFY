package test.com.ssafy.product;

import com.ssafy.product.*;

public class ProductTest {

	public static void main(String[] args) {
		TV tv1 = new TV("435110","UN43K5110BF",411560,2,43,"UHD");
		Refrigerator r1 = new Refrigerator("536035","RT53K6035SL",621320,1,525);
		
		System.out.println(tv1.toString());
		System.out.println();
		System.out.println(r1.toString());

	}

}
