package com.gn.study.model.vo;

public class Parent {
	private int a;
	
	public int getA() {
		return a;
	}
	
	public Parent() {}
	
	public Parent(int a) {
		this.a = a;
		System.out.println("부모 매개변수 생성자지롱~");
	}
}
