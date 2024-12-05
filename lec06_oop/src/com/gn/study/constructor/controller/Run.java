package com.gn.study.constructor.controller;

import com.gn.study.constructor.model.vo.Book;
import com.gn.study.constructor.model.vo.Cake;
import com.gn.study.constructor.model.vo.Car;
import com.gn.study.constructor.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// 기본생성자
		Car c1 = new Car();
		
		// 매개변수 생성자
		Car car = new Car("현대", "회색", 2024);
	
		// Run 클래스에 Book 객체 생성하기
		Book b1 = new Book(15000);
		Book b2 = new Book(20000);
		
		// 오버로딩
		String[] students = {"김철수", "이영희", "홍길동"};
		for(int i = 0; i < students.length; i++) {
			Student s = new Student();
			s.printInfo(i);
			s.printInfo(students[i]);
			s.printInfo(i+240001, students[i]);
			System.out.println();
		}
		
		System.out.println("===================");
		
		Cake c = new Cake();
		//인스턴스 변수
		// 4순위 변수 기본값
		// 3순위 명시적 초기화
		// 2순위 초기화 블록
		// 1순위 생성자를 이용한 초기화
		System.out.println(c.flavor);
		// 클래스 변수(static)
		// 4순위 변수 기본값
		// 3순위 명시적 초기화
		// 2순위 초기화 블록
		// 1순위(비추). 생성자를 이용한 초기화
		System.out.println(c.price);
		
		
		
		
		
		
	}
}
