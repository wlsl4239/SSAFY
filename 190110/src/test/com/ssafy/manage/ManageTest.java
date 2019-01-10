package test.com.ssafy.manage;

import com.ssafy.manage.Student;
import com.ssafy.manage.Teacher;

public class ManageTest {
	public static void main(String[] args) {
		
		double[] s2Grade = {4.3, 4.0, 4.5, 2.5 ,3.7 ,2.0 ,3.0 ,4.5, 4.0, 4.3};
		int[] t2Salary = {50000, 90000, 60000, 20000, 150000, 30000, 35000, 49000, 56000, 72000, 33000, 36000};
		
		Student s1 = new Student(1111,"남","010-1111-2222");
		Student s2 = new Student(2222,"여","010-1234-5678", s2Grade);
		Student s3 = new Student(3333,"남","010-1010-1010");
		Teacher t1 = new Teacher(4444,"여","010-2030-4050");
		Teacher t2 = new Teacher(5555,"남","010-9988-7766", t2Salary);
		Teacher t3 = new Teacher(3333,"여","010-4567-8950");
		
		s1.setGrade(1, 4.3);
		s1.setGrade(2, 4.5);
		s1.setGrade(3, 4.0);
		s1.setGrade(4, 3.5);
		s1.setGrade(5, 4.3);
		s1.setGrade(6, 4.5);
		s1.setGrade(7, 4.0);
		s1.setGrade(8, 4.3);
		s1.setGrade(9, 2.5);
		s1.setGrade(10, 3.7);
		
		s3.setGrade(1, 4.3);
		s3.setGrade(6, 4.5);
		s3.setGrade(2, 4.5);
		s3.setGrade(10, 3.7);
		s3.setGrade(3, 4.0);
		s3.setGrade(5, 4.3);
		s3.setGrade(9, 2.5);
		s3.setGrade(7, 4.0);
		s3.setGrade(8, 4.3);
		s3.setGrade(4, 3.5);
		s3.setGrade(11,3.0);	// 11학기는 없으므로 추가되지 않음.

		t1.setSalary(1,50000);
		t1.setSalary(2,55000);
		t1.setSalary(3,20000);
		t1.setSalary(4,30000);
		t1.setSalary(5,70000);
		t1.setSalary(6,80000);
		t1.setSalary(7,40000);
		t1.setSalary(8,56000);
		t1.setSalary(9,68000);
		t1.setSalary(10,120000);
		t1.setSalary(11,31000);
		t1.setSalary(12,96000);

		t3.setSalary(1,10000);
		t3.setSalary(5,60000);
		t3.setSalary(7,40000);
		t3.setSalary(6,80000);
		t3.setSalary(8,56000);
		t3.setSalary(9,68000);
		t3.setSalary(2,55000);
		t3.setSalary(3,20000);
		t3.setSalary(4,30000);
		t3.setSalary(10,120000);
		t3.setSalary(11,31000);
		t3.setSalary(12,96000);

		System.out.println(s1);
		System.out.println("< s1 전화번호 변경 >\n");
		s1.setPhoneNum("010-8080-3030");
		System.out.println(s1);
		
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
