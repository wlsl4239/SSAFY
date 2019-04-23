package test.com.ssafy.product;

import com.ssafy.product.ProductMgr;
import com.ssafy.product.Product;

public class ProductTest {

	public static void main(String[] args) {
		ProductMgr pm = new ProductMgr();
		System.out.println("상품정보를 객체배열을 활용하여 저장");
		pm.add(new Product("1234","TV",600000,3));
		pm.add(new Product("1111","컴퓨터",2000000,1));
		pm.add(new Product("1222","냉장고",800000,4));
		pm.add(new Product("1333","세탁기",120000,2));
		pm.add(new Product("1444","청소기",160000,6));
		
		System.out.println("\n상품정보 전체를 검색");
		for(Product p:pm.search())
			System.out.println(p);
		
		System.out.println("\n상품번호로 검색");
		System.out.println(pm.searchNum("1111"));
		
		System.out.println("\n상품명으로 검색");
		System.out.println(pm.searchName("냉장고"));
		
		System.out.println("\n상품번호와 가격을 입력하여 가격변경");
		pm.setPrice("1333", 100000);
		System.out.println("\n가격변경 후");
		for(Product p:pm.search())
			System.out.println(p);
		
		System.out.println("\n상품번호로 삭제");
		pm.deleteProduct("1333");
		System.out.println("\n삭제 후");
		for(Product p:pm.search())
			System.out.println(p);
		
		
		System.out.println("\n전체 재고상품 금액");
		System.out.println(pm.totalPrice());
	}

}
