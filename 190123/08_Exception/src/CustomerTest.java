import java.util.ArrayList;
import java.util.Collection;

public class CustomerTest {
	public static void main(String[] args) {
		
		Collection<Customer> c = new ArrayList();
		
		c.add(new Customer("홍길동"));
		c.add(new Customer("김"));
		c.add(new Customer("이순신"));
		
		for (Customer customer : c) {
			System.out.println(customer);
		}
	}
}
