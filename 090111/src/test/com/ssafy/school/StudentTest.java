package test.com.ssafy.school;

import com.ssafy.school.Student;

// test ==> 마지막 코드가 안정적으로 종료되는지. 누락되지 않도록 테스트. Yes - 내용까지 체크.
// 
public class StudentTest {
	public static void main(String[] args) {
		Student[] studentList = new Student[3];
		studentList[0] = new Student("200101001",'F',"010-1111-2222");
		studentList[1] = new Student("200101002",'M',"010-1111-2222");
		studentList[2] = new Student("200101003",'S',"010-1111-2222");
		
		studentList[1].setPhoneNumber("010-5555-6666");
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.5);
		studentList[2].addGrade(4.2);
		studentList[2].addGrade(4.3);
		studentList[2].setGrade(1,3.5);
		
		System.out.println(studentList[0]);
		System.out.println(studentList[1]);
		System.out.println(studentList[2]);
				
		System.out.println("end");
	}
}
