package com.gn.homework01.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + "급여 : " + salary + "\n부서 : " + dept;
	}
}
