import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, UserObject> map = new HashMap();
		
		System.out.println(map);
		
		map.put(1, new UserObject("jeon",1234));
		map.put(1, new UserObject("kim",1234));
		map.put(2, new UserObject("korea",10));
		System.out.println(map);
		System.out.println(map.keySet());
		
		for(Integer key : map.keySet()) {
			int inputKey = 1;
//			if(inputKey == key.intValue())
			if(new Integer(inputKey).equals(key)) {
				System.out.println("중복 저장");
				break;
			}
			
		}
	}
}
