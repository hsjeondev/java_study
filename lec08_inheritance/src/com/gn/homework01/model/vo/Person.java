package com.gn.homework01.model.vo;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}
	
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return "=== " + name + "===\n" + "나이 : " + age + "\n키 : " + height + "\n몸무게 : " + weight + "\n";
	}
}
