package com.gn.study.model.vo;

public class Child extends Parent {
	private int b;
	
	public Child() {
		super(3);
		System.out.println("자식의 기본 생성자 호출!!");
	}
	
	public Child(int a, int b) {
		super(a);
		this.b = b;
		System.out.println("자식 매개변수 생성자 호출~~");
	}
	
}
