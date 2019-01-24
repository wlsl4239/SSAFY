package test.com.ssafy.product;

import com.ssafy.product.CodeNotFoundException;
import com.ssafy.product.DuplicateException;
import com.ssafy.product.Product;
import com.ssafy.product.ProductMgrImpl;
import com.ssafy.product.ProductNotFoundException;
import com.ssafy.product.Refrigerator;
import com.ssafy.product.TV;

public class ProductTest {
	private ProductMgrImpl pm;
	
	public ProductTest() throws DuplicateException, CodeNotFoundException, ProductNotFoundException {
		pm = new ProductMgrImpl();
		startUI();
	}
	
	private void startUI() throws DuplicateException, CodeNotFoundException, ProductNotFoundException {
		pm.add(new TV("35110","AAAA TV",431500,3,48,"FHD"));
		pm.add(new Refrigerator("53635","CCC 냉장고",515000,2,350));
		pm.add(new TV("45110","BBBB TV",501000,1,46,"QHD"));
		pm.add(new TV("43511","AABB TV",601000,1,42,"UHD"));
		pm.add(new Refrigerator("50335","BBB 냉장고",530000,3,300));


		System.out.println("1. 상품 전체를 검색");
		for(Product p : pm.searchAll()) 
			System.out.println(p);


		System.out.println("2. 상품 번호로 상품을 검색");
		try {
		System.out.println(pm.searchByNum("50000"));
		}catch(CodeNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("3. 상품명으로 상품을 검색(부분검색 가능)");
		for(Product p : pm.searchByName("AA"))
			System.out.println(p);


		System.out.println("4. TV정보만 검색");
		for(Product p : pm.searchTV())
			System.out.println(p);


		System.out.println("5. Refrigerator만 검색");
		for(Product p : pm.searchRefrigerator())
			System.out.println(p);


		System.out.println("6. 400L 이상의 refrigerator 검색");
		try {
		for(Product p : pm.searchRefrigeratorByCapacity(400)) 
			System.out.println(p);
		}catch(ProductNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("7. 50inch 이상의 TV 검색");
		try {
		for(Product p : pm.searchTVByInch(50))
			System.out.println(p);
		}catch(ProductNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("8. 상품번호와 가격을 입력받아 상품가격을 변경할수 있는 기능");
		try {
		pm.setProductPrice("40000", 580000);
		System.out.println(pm.searchByNum("40000"));
		} catch(CodeNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("9. 상품번호로 상품을 삭제하는 기능");
		try {
		pm.deleteProduct("40000");
		}catch(CodeNotFoundException e) {
			e.printStackTrace();
		}
		for(Product p : pm.searchAll()) 
			System.out.println(p);

		System.out.println("10. 전체 재고상품 금액을 구하는 기능");
		System.out.println(pm.totalPrice());
		
		pm.saveFile();
		pm.send();
	}

	public static void main(String[] args) throws DuplicateException, CodeNotFoundException, ProductNotFoundException {
		new ProductTest();
		
		System.out.println("END");

	}

}


