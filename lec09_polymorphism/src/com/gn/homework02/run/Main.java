package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class Main {

	public static void main(String[] args) {
		
		Menu[] menus = new Menu[5];
		int index = 0;
		
		while(index != menus.length) {
			
			int random = (int)(Math.random() * (2));
			
			if(random == 0) {
				menus[index++] = new Dish("스테이크", 50000, "소");
			} else if(random == 1) {
				menus[index++] = new Drink("아메리카노", 7000, "물 200g과 원두 30g");
			}
			
		}
		
		for(Menu menu : menus) {
			menu.cook();
		}
	}

}
