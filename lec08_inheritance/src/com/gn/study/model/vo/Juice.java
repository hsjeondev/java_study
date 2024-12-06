package com.gn.study.model.vo;

public class Juice extends Beverage {
	private String fruit;
	
	public Juice(String name, int volume, String fruit) {
		super(name, volume);
		this.fruit = fruit;
	}
	
	public void juiceInfo() {
		super.printInfo();
		System.out.println("- 과일 : " + fruit);
	}
}
