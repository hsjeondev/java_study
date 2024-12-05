package com.gn.study.capsule;

public class Student {
	private int studentNo;
	
	// 생성자는 최초 할당
	// 필드 우선순위는 초기 할당
	
	// setter는 재할당 + 캡슐화를 위해서
	
	
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
}
