package com.gn.study.constructor.controller;

import com.gn.study.constructor.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		// 기본생성자
		Car c1 = new Car();
		
		// 매개변수 생성자
		Car car = new Car("현대", "회색", 2024);
	}
}
