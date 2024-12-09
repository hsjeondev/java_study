package com.gn.practice03.controller;

import com.gn.practice03.model.vo.Bicycle;
import com.gn.practice03.model.vo.Car;
import com.gn.practice03.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		Vehicle bicycle = new Bicycle();
		
		car.go();
		bicycle.go();

	}

}
