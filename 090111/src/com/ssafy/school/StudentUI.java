package com.ssafy.school;

import java.util.Scanner;

/*
 *   -- M E N U -- 
 *  1. 학생 입력 
 *  2. 성적 입력 
 *  3. 성적 수정 
 *  4. 특정 학생 정보 보기 
 *  5. 모든 학생 정보 보기 
 *  0. 종료
 */
public class StudentUI {
	private Scanner sc;
	private Student[] studentList;
	private int studentListIndex;
	
	public StudentUI() {
		sc = new Scanner(System.in);
		studentList = new Student[10];
		startUI();
	}

	private void startUI() {
		System.out.println(	"  MENU \r\n" + " 1. 학생정보 입력 \r\n" + " 2. 성적 입력 \r\n" + " 3. 성적 수정 \r\n" + " 4. 특정 학생 정보 보기 \r\n" +" 5. 모든 학생 정보 보기 \r\n" +" 0. 종료\n");
		while(true) {
			System.out.print("메뉴 입력 : ");
			String menuFlag = sc.nextLine();
			switch(menuFlag) {		// 이벤트 구분
			case "1":
				addStudent();		// 메뉴에는 직접 구현하지 않고 메서드나 객체로 분리해서 정의한다. => 가독성
				break;
			case "2":
				addGrade();
				break;
			case "3":
				editGrade();
				break;
			case "4":
				getStudent();
				break;
			case "5":
				getStudents();
				break;
			case "0":
				exitUI();					
				break;
			default:
				System.out.println("잘못된 입력입니다.");

			}//switch
			
		}//while		
	}

	private String getInput(String title) {
		System.out.print(title + " : ");
		return sc.nextLine();
	}


	private void editGrade() {
		studentList[Integer.parseInt(getInput("몇 번 째 학생?"))-1].setGrade(Integer.parseInt(getInput("학기 입력")), Double.parseDouble(getInput("학점 입력")));
		System.out.println("성적 변경 완료\n");
	}

	private void addGrade() {
		studentList[Integer.parseInt(getInput("몇 번 째 학생?"))-1].addGrade(Double.parseDouble(getInput("학점 입력")));
		System.out.println("성적 추가 완료\n");
	}

	private void addStudent() {
		studentList[studentListIndex++] = new Student(getInput("학번 입력"),getInput("성별 입력").charAt(0),getInput("전화번호 입력"));
		System.out.println("학생 추가 완료\n");
	}
	private void getStudents() {
		for(Student student : studentList)
			if(student!=null)
				System.out.println(student);
		System.out.println();
	}
	private void getStudent() {
		System.out.println(studentList[Integer.parseInt(getInput("몇 번 째 학생?"))-1]+"\n");
	}
	private void exitUI() {
		System.out.println("프로그램 종료 메뉴 실행");
		System.exit(0);
	}


	public static void main(String[] args) {
		new StudentUI();

		System.out.println("정상 종료");

	}
}
