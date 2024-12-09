package com.gn.homework04.run;

import com.gn.homework04.model.vo.GalaxyS24;
import com.gn.homework04.model.vo.Iphone15;
import com.gn.homework04.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone[] smartPhones = new SmartPhone[2];
		
		smartPhones[0] = new GalaxyS24();
		smartPhones[1] = new Iphone15();
		
		for(SmartPhone smartPhone : smartPhones) {
			smartPhone.printMaker();
			smartPhone.makeCall();
			smartPhone.takeCall();
			smartPhone.touch();
			smartPhone.charge();
			smartPhone.picture();
			System.out.println();
		}
	}

}
