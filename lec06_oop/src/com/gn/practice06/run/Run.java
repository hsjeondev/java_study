package com.gn.practice06.run;

import com.gn.practice06.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.setId("user01");
		person.setPwd("1234");
		person.setName("김철수");
		person.setAge(43);
		person.setGender('M');
		person.setPhone("010-111-1111");
		person.setEmail("ksc@gmail.com");
		
		String personInfo = person.information();
		
		System.out.println(personInfo);

	}

}