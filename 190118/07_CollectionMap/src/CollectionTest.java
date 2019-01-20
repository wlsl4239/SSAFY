import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<UserObject> c = new ArrayList();
		System.out.println(c);
		c.add(new UserObject("jeon",10));
		System.out.println(c);
		UserObject u1 = new UserObject("홍길동",100);
		c.add(u1);
		System.out.println(c);
		u1.setAge(50);
		System.out.println(c);
		
		for (UserObject user : c) {
//			user.setName("이순신");
//			UserObject temp = new UserObject(user.getName(),user.getAge());
			UserObject temp = new UserObject(user);
			temp.setName("이순신");
		}
		System.out.println(c);
		
	}	
}
