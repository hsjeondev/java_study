package com.gn.study.model.vo;

public class Beverage {
	private String name;
	private int volume;
	
	public Beverage(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}
	
	public void printInfo() {
		System.out.println("- 이름 : " + name);
		System.out.println("- 용량 : " + volume);
	}
	
}
