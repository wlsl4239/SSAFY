package test.com.ssafy.school;

import com.ssafy.school.*;

public class SchoolTest {
	public static void main(String[] args) {
		//학생 또는 교사 정보를 입력하세요 - 부모를 선택할때는 가장 가까운 부모를 선택하는걸 권장.
		Person obj = new Student("학번","학생이름");
		obj = new Teacher("교사이름","교번");
		System.out.println(obj);
		
		//입력된 학생 또는 교사의 이름을 출력하세요
		
		System.out.println(obj.getName());
		
		//학생이라면 학번을 교사라면 교번을 출력하세요
		int num = (int)5.0;
		
		if(obj instanceof Teacher) {
			Teacher t = (Teacher)obj;
			System.out.println(t.getNum());
		}
		else if(obj instanceof Student) {
			Student s = (Student)obj;
			System.out.println(s.getNum());
		}
			
			
	}

}
