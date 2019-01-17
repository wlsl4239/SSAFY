import java.util.*;
// 데이터를 가변적으로 넣고 싶다.
// 단, 중복을 체크하고 싶다.
public class SetTest {
	
	public static void main(String[] args) {
		Collection c;
		c = new HashSet();
		
		System.out.println(c.add("hi"));
		System.out.println(c.add(new String("hi")));
		System.out.println(c.add(1234));	//5.0부터 int -> Integer 자동 매핑됨.
		System.out.println(c.add(new Integer(1234)));
		System.out.println(c.add(new UserObject("이름",10)));
		System.out.println(c.add("hi"));
		System.out.println(c.add(new String("hi")));
		System.out.println(c.add(1234));	//5.0부터 int -> Integer 자동 매핑됨.
		System.out.println(c.add(new Integer(1234)));
		System.out.println(c.add(new UserObject("이름",10)));
		
		System.out.println(c);
		System.out.println(c.size());
	}
	
}
