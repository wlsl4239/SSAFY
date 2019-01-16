package test.com.ssafy.school;

import java.util.Arrays;

import com.ssafy.school.*;

public class MgrTest {
	public static void main(String[] args) {
		SchoolMgr m;
		//m = new SchoolMgr();
		m = SchoolMgr.getInstance();
		
		System.out.println(m);
		
		m.add(new Teacher("홍길동","t1"));
		m.add(new Teacher("홍길동","t2"));
		m.add(new Teacher("김길동","t3"));
		m.add(new Student("s1","이순신"));
		m.add(new Student("s2","김경수"));
		m.add(new Student("s3","김경수"));
		
		System.out.println(m);
		
		String[] n = m.getNames();
		System.out.println(Arrays.toString(n));
		
		Student s1 = m.getStudent("s1");
		System.out.println(s1);
		
		Teacher t1 = m.getTeacher("t1");
		System.out.println(t1);
		
		Teacher t2 = m.getTeacher(t1);
		System.out.println(t2);
		
		Teacher teachers[] = m.getTeacherByName("홍길동");
		System.out.println(Arrays.toString(teachers));
		
		m.setStudentName(s1, "최경수");
		System.out.println(s1);
	}
}
