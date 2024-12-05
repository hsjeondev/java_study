package com.gn.homework06.controller;

import com.gn.homework06.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(3, 5);
		
		rectangle1.printInfo();
		rectangle2.printInfo();
		
	}

}
