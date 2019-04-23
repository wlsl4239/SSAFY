import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ssafy.product.ProductManager;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext cx = new GenericXmlApplicationContext("applicationConfig.xml");
		
		ProductManager pm = cx.getBean("pm",ProductManager.class);
		
		System.out.println(pm.getProduct());
	}
}
