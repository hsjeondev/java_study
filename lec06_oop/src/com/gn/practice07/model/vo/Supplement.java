package com.gn.practice07.model.vo;

public class Supplement {
	private String name;
	private int pill;
	private int price;
	
	public Supplement(String name, int pill, int price) {
		this.name = name;
		this.pill = pill;
		this.price = price;
	}
	
	public void printSupplementInfo() {
		System.out.printf("이름: %s, 복용량: %d알, 가격: %d원\n", name, pill, price);
	}
}
