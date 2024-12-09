package com.gn.study.model.vo;

// 추상 클래스
public abstract class Animal {
	// 추상 메소드
	public abstract void sound();
	
	public void breath() {
		System.out.println("동물은 숨을 쉽니다.");
	}
}
