package com.gn.study.field.controller;

import com.gn.study.field.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		// 1. 객체 생성
		Car c1 = new Car();
		// 2. 값 대입
		// c1.name = "소방차";
		// 값 호출
		System.out.println(c1.name);

		// static 예약어
		Car c2 = new Car();
		Car c3 = new Car();
		c2.brand = "현대";
		System.out.println(c2.name);
		System.out.println(c2.brand);
		c3.brand = "BMW";
		System.out.println(c2.brand);
		System.out.println(c3.brand);
		
		// 명시적 초기화 한 name 필드 출력
		System.out.println(c3.name);
	}

}
