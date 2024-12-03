package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();

		person1.phoneNumber = "01012345678";
		person1.height = 190.5;
		person1.weight = 100.2;
		person2.phoneNumber = "01056434563";
		person2.height = 175.4;
		person2.weight = 65.6;
		
		System.out.print("전화번호 : " + person1.phoneNumber + ", ");
		System.out.print("키 : " + person1.height + ", ");
		System.out.println("몸무게 : " + person1.weight);
		System.out.print("전화번호 : " + person2.phoneNumber + ", ");
		System.out.print("키 : " + person2.height + ", ");
		System.out.println("몸무게 : " + person2.weight);
		
	}

}
