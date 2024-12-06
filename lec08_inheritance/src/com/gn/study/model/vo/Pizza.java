package com.gn.study.model.vo;

public class Pizza extends Food {
	
	@Override // @를 사용하는 이 기능을 어노테이션이라고 부름 -> 어노테이션 오버라이드라고 읽음
	public void printReaction() {
		System.out.println("Buono!!");
	}
	
}
