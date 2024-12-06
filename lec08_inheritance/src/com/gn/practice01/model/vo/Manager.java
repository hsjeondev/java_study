package com.gn.practice01.model.vo;

public class Manager extends Employee {
	
	private String department;
	
	public Manager() {}

	public Manager(String name, String depatment) {
		super(name);
		this.department = depatment;
	}
	
	public void printDeaprtment() {
		super.printInfo();
		System.out.println("담당 부서 : " + department);
	}

}