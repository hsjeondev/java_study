package com.gn.homework08.open.controller;

import com.gn.homework08.open.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "김철수";
		person.age = 20;
		
		System.out.printf("%s는 %d살 입니다.", person.name, person.age);

	}

}
