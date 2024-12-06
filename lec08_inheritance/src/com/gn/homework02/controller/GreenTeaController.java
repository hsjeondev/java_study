package com.gn.homework02.controller;

import com.gn.homework02.model.vo.GreenTea;

public class GreenTeaController {
	
	private GreenTea gt = new GreenTea();
	
	public String bakeChocolateCake(double flour, double cream, double powder, int cheese) {
		
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		
		return gt.toString();
	}
}
