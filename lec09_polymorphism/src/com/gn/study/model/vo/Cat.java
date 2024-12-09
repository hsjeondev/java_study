package com.gn.study.model.vo;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
	@Override
	public void breath() {
		System.out.println("그르릉~");
	}
}
