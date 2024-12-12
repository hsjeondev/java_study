package com.gn.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice08.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		Set<Person> persons1 = new HashSet<Person>();
		persons1.add(new Person("홍길동", 20));
		persons1.add(new Person("이순신", 25));
		persons1.add(new Person("유관순", 22));
		Set<Person> persons2 = new HashSet<Person>();
		persons2.add(new Person("유관순", 22));
		persons2.add(new Person("강감찬", 27));
		persons2.add(new Person("을지문덕", 30));
		
		Set<Person> union = new TreeSet<Person>(persons1);
		union.addAll(persons2);
		Set<Person> interception = new TreeSet<Person>(persons1);
		interception.retainAll(persons2);
		Set<Person>	difference = new TreeSet<Person>(persons1);
		difference.removeAll(persons2);
		

		int number = 1;
		System.out.println("=== 합집합 ===");
		Iterator<Person> iterator = union.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(number + "번 " + person);
			number++;
			iterator.remove();
			if(union.size() == 0) {
				number = 1;
			}
		}
		
		System.out.println("=== 교집합 ===");
		Iterator<Person> iterator1 = interception.iterator();
		while(iterator1.hasNext()) {
			Person person = iterator1.next();
			System.out.println(number + "번 " + person);
			number++;
			iterator1.remove();
			if(interception.size() == 0) {
				number = 1;
			}
		}
		
		System.out.println("=== 차집합 ===");
		Iterator<Person> iterator2 = difference.iterator();
		while(iterator2.hasNext()) {
			Person person = iterator2.next();
			System.out.println(number + "번 " + person);
			number++;

		}
		
		
		
		
		
		
		
		
	}

}
