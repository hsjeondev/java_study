package com.gn.study.constructor.model.vo;

public class Car {
	private String brand;
	private String color;
	private int year;
	
//	public Car(String b, String c, int y) {
//		brand = b;
//		color = c;
//		year = y;
//	}
	
	public Car() {
		this("미정", "미정", 2024);
	}
	
	public Car(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}

}
