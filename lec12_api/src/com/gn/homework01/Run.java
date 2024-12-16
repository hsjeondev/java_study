package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] persons = str.split("\n");
		
		for(String person : persons) {
			String[] onePerson = person.split(",");
			String name = onePerson[0];
			int age = Integer.parseInt(onePerson[1]);
			String address = onePerson[2];
			char gender = onePerson[3].charAt(0);
			
			Person man = new Person(name, age, address, gender);
			System.out.println(man.toString());
		}

	}

}
