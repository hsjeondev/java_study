package com.gn.homework09.controller;

import com.gn.homework09.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setStudentName("김철수");
		student1.setClassroomNumber("A");
		int studentNumber1 = student1.getStudentNumber();
		String studentName1 = student1.getStudentName();
		String studentClass1 = student1.getClassroomNumber();
		System.out.println(studentNumber1 + " " + studentName1 + " " + studentClass1);
		
		Student student2 = new Student();
		student2.setStudentName("홍길동");
		student2.setClassroomNumber("F");
		int studentNumber2 = student2.getStudentNumber();
		String studentName2 = student2.getStudentName();
		String studentClass2 = student2.getClassroomNumber();
		System.out.println(studentNumber2 + " " + studentName2 + " " + studentClass2);
		
		Student student3 = new Student();
		student3.setStudentName("이영희");
		student3.setClassroomNumber("B");
		int studentNumber3 = student3.getStudentNumber();
		String studentName3 = student3.getStudentName();
		String studentClass3 = student3.getClassroomNumber();
		System.out.println(studentNumber3 + " " + studentName3 + " " + studentClass3);
		
	}

}
