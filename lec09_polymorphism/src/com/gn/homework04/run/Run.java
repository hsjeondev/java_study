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
			if(smartPhone instanceof GalaxyS24) {
				System.out.print("갤럭시24는 ");
				smartPhone.printMaker();
				System.out.println("에서 만들어 졌다.");
			}
			if(smartPhone instanceof Iphone15) {
				System.out.print("아이폰15는 ");
				smartPhone.printMaker();
				System.out.println("에서 만들어 졌다.");
			}
			smartPhone.makeCall();
			smartPhone.takeCall();
			smartPhone.touch();
			smartPhone.charge();
			smartPhone.picture();
			System.out.println();
		}
	}

}
