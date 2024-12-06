package com.gn.study.model.vo;

// 1. 클래스에 final
//public final class BasicCalculator { // 클래스 자체 상속 불가
public class BasicCalculator { // 클래스는 상속 가능
	// 2. 메소드에 final
	public final int add(int a, int b) { // 메소드 오버라이딩 불가능
		return a + b;
	}
	
	public int subtract(int a, int b) { // 메소드 오버라이딩 가능
		return a - b;
	}
	
}
