package com.gn.study.controller;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.gn.study.model.vo.Product;
import com.gn.study.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(3);
		class2.add(4);
		class2.add(5);
		
		System.out.println("=== 합집합 ===");
//		class1.addAll(class2); -> 이렇게 해버리면 class1의 원래 값 대신 합집합 값이 들어감, 원래 값 손실
		Set<Integer> union = new HashSet<Integer>(class1); // 초기값 설정 가능
		union.addAll(class2);
		System.out.println(union);

		System.out.println("=== 교집합 ===");
//		class1.retainAll(class2); -> 이것도 원래 데이터 손실
		Set<Integer> intersection = new HashSet<Integer>(class1);
		intersection.retainAll(class2);
		System.out.println(intersection);
		
		System.out.println("=== 차집합 ===");
//		class1.removeAll(class2); -> 이것도 원래 데이터 손실
		Set<Integer> difference = new HashSet<Integer>(class1);
		difference.removeAll(class2);
		System.out.println(difference);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("철수", 20));
		set1.add(new Student("우석", 28));
		set1.add(new Student("은우", 30));
		Set<Student> set2 = new HashSet<Student>();
		set2.add(new Student("철수", 20));
		set2.add(new Student("길동", 25));
		
//		set1.addAll(set2);
//		set1.retainAll(set2);
		set1.removeAll(set2);
		System.out.println(set1);
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		
		Iterator<String> iterator = fruits.iterator();
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.print(fruit);
			iterator.remove();
			if(fruits.size() != 0) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.println();
		System.out.println("=== LinkedHashSet ===");
		System.out.println();
		
		Set<String> set4 = new LinkedHashSet<String>();
//		set4 = new HashSet<String>();
//		set4 = new TreeSet<String>();
		set4 = new TreeSet<String>(Collections.reverseOrder());
		set4.add("동");
		set4.add("서");
		set4.add("남");
		set4.add("북");
		System.out.println(set4);
		
		Set<Product> set = new TreeSet<Product>();
		set.add(new Product("젤리", 2000));
		set.add(new Product("사탕", 500));
		set.add(new Product("홍삼", 8000));
		System.out.println(set);
	}

}
