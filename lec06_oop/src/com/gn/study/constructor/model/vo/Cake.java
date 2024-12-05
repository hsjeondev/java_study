package com.gn.study.constructor.model.vo;

public class Cake {
	public String flavor = "Choco";
	
	public static int price = 27000;
	
	{flavor = "딸기";}
	static {price = 32000;}
	
	public Cake() {
		this.flavor = "녹차";
		// this.price = 40000; 쓰면 되긴 하는데, 하지마
	}
}
