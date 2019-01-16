package com.ssafy.school;

import java.util.Arrays;

public class SchoolMgr {
	private Person[] list = new Person[10];
	private int listIndex;
	private static SchoolMgr mgr;
	//싱글톤
	private SchoolMgr() {}
	public static SchoolMgr getInstance() {
		if(mgr==null)
			mgr = new SchoolMgr();
		return mgr;
	}
	//학생 또는 교사 정보를 추가할 수 있다.
	public void add(Person p) {
		list[listIndex++] = p;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(list);
	}
	//현재 추가된 모든 사람의 이름을 출력
	public String[] getNames() {
		String[] names = new String[10];

		for (int i=0;i<list.length;i++) {
			if(list[i] == null)
				break;
			names[i] = list[i].getName();
		}

		return names;
	}
	//특정학번의 학생정보를 출력
	public Student getStudent(String num) {

		for(int i=0;i<listIndex;i++) {
			if(list[i] instanceof Student) {
				Student temp = (Student)list[i];
				if(temp.getNum().equals(num)) {
					return temp;
				}
			}
		}
		return null;
	}

	//특정 교사의 정보를 출력	overloading : 업무의 다양성  // 매개인자를 다양하게 정의.
	public Teacher getTeacher(String num) {
		for(int i=0;i<listIndex;i++) {
			if(list[i] instanceof Teacher) {
				Teacher temp = (Teacher)list[i];
				if(temp.getNum().equals(num)) {
					return temp;
				}
			}
		}
		return null;

	}
	public Teacher getTeacher(Teacher searchT) {
		//return searchT;
		for(int i=0;i<listIndex;i++) {
			if(list[i] instanceof Teacher) {
				Teacher temp = (Teacher)list[i];
				if(temp == searchT) {
					return temp;
				}
			}
		}
		return null;
	}
	//이름을 검색해서 학생 또는 교사 여부를 확인
	//Map을 응용하면 가능.
	//	public boolean isStudent(String name) {
	//
	//	}

	//교사 중에서 xxx이름을 가진 정보를 확인
	public Teacher[] getTeacherByName(String name) {
		Teacher[] t = new Teacher[10];
		int count = 0;
		
		for(int i=0;i<listIndex;i++) {
			if(list[i] instanceof Teacher) {
				if(list[i].getName().equals(name)) {
					t[count] = (Teacher)list[i];
					count++;
				}
			}
		}
		return t;

	}
	//특정 학생의 이름을 수정
	public void setStudentName(Student s) {
		setStudentName(s,s.getName());
	}
	public void setStudentName(Student s,String name) {
		//s.setName(name);
		
		for(int i=0;i<listIndex;i++) {
			if(list[i] != null && list[i] instanceof Student) {
				Student temp = (Student)list[i];
				if(temp == s) {
					temp.setName(name);
					return;
				}
			}
		}
	}
}
