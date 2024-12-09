package com.gn.practice01.model.vo;

public class Employee extends Person {

	@Override
	public void introduce() {
		System.out.println("저는 직원입니다.");
	}
}
