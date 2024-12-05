package com.gn.homework09.model.vo;

public class Student {
	
	private static int studentNumber;
	private String studentName;
	private String classroomNumber;
	
	public Student() {}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassroomNumber() {
		return classroomNumber;
	}
	public void setClassroomNumber(String classroomNumber) {
		this.classroomNumber = classroomNumber;
	}
	
	
}
