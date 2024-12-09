package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.Engine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {

	public static void main(String[] args) {
		
		Engine gasoline = new GasolineEngine();
		Engine Electric = new ElectricEngine();
		
		Car car1 = new Car(gasoline);
		Car car2 = new Car(Electric);
		
		car1.start();
		car2.start();

	}

}
