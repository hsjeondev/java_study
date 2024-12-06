package com.gn.practice02.controller;

import com.gn.practice02.model.vo.Appliance;
import com.gn.practice02.model.vo.Refrigerator;
import com.gn.practice02.model.vo.WashingMachine;

public class Run {

	public static void main(String[] args) {

		Appliance appliance = new Appliance();
		WashingMachine washingMachine = new WashingMachine();
		Refrigerator refrigerator = new Refrigerator();
		
		appliance.turnOn();
		washingMachine.turnOn();
		refrigerator.turnOn();

	}

}
