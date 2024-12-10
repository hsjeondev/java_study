package com.gn.study.model.vo;

public class User {
	
	public void checkAge(int age) {
		if(age < 15) {
			throw new IllegalArgumentException("15세 이상이어야 합니다.");
		}
		
		System.out.println("나이가 확인 되었습니다.");
	}
	
	public void nameLength(String name) throws NullPointerException {
		System.out.println(name.length() + "개");
	}
}
