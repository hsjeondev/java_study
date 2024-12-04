package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car secondCar = new Car();
		
		car.startEngine();
		int speed = car.checkSpeed();
		System.out.printf("기본 속도는 %dkm/h 입니다.\n", speed);
		car.setSpeed(150);
		String message = car.setDestination("부산");
		System.out.println(message);
		
		System.out.println();
		
		secondCar.move(true);

	}

}
