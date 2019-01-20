import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		int [] numbers = {1,3,6,2,7,9,8};
		
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(numbers);
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		
		String [] names = {"홍길동","전혜영","이순신"};
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		Collection<String> names2 = new ArrayList();
		
		names2.add("이순신");
		names2.add("강감찬");
		System.out.println(names2);
		
		Collections.sort((List<String>)names2);
		System.out.println(names2);
		
		ArrayList<UserObject> list = new ArrayList();
		list.add(new UserObject("이순신",10));
		list.add(new UserObject("강감찬",15));
		list.add(new UserObject("이순신",5));
		list.add(new UserObject("강감찬",5));
		
		
		System.out.println(list);
		Collections.sort(list);		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<UserObject>() {

			@Override
			public int compare(UserObject o1, UserObject o2) {
				//if(o1.getAge() > o2.getAge())		//오름차순
				if(o1.getAge() < o2.getAge())		//내림차순
					return 1;
				else if(o1.getAge() > o2.getAge())
					return -1;
				
				return 0;
			}	
		});
	}
}
