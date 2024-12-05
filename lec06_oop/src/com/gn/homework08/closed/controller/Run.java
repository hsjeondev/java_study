package com.gn.homework08.closed.controller;

import com.gn.homework08.closed.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("김철수");
		person.setAge(20);
		
		System.out.printf("%s는 %d살 입니다.", person.getName(), person.getAge());
		
	}

}
