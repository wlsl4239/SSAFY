package test.com.ssafy.product;

import com.ssafy.product.*;

public class ProductTest {

	public static void main(String[] args) {
		TV tv[] = new TV[5];
		Refrigerator r[] = new Refrigerator[5];
		
		tv[0] = new TV("35110","TV 1",431500,3,48,"FHD");
		tv[1] = new TV("45110","TV 2",501000,1,50,"QHD");
		tv[2] = new TV("43110","TV 3",411560,1,43,"FHD");
		tv[3] = new TV("43510","TV 4",550500,2,55,"UHD");
		tv[4] = new TV("43511","TV 5",601000,1,60,"UHD");
		
		
		r[0] = new Refrigerator("53635","냉장고 1",515000,2,525);
		r[1] = new Refrigerator("42505","냉장고 2",420000,1,400);
		r[2] = new Refrigerator("56035","냉장고 3",580000,2,600);
		r[3] = new Refrigerator("36035","냉장고 4",490000,2,500);
		r[4] = new Refrigerator("50335","냉장고 5",530000,3,550);

		
		System.out.println("****************** TV 정보 *******************");

		for(int i=0;i<5;i++)
			System.out.println(tv[i]+"\n");
		System.out.println("***************** 냉장고 정보 ******************");

		for(int i=0;i<5;i++)
			System.out.println(r[i]+"\n");
	}

}
