package com.gn.homework01.model.vo;

public class Food extends Product {
	
	private int expirationDays;
	
	public Food() {}
	
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		int discountRate = 0;
		
		if(expirationDays <= 1) {
			discountRate = 80;
		} else if(expirationDays <= 5) {
			discountRate = 50;
		} else if(expirationDays <= 10) {
			discountRate = 20;
		} else {
			discountRate = 100;
		}
		
		return discountRate;
	}
	
	@Override
	public int calculatePrice() {
		int discountPrice = (super.getPrice() * calculateDiscountRate()) / 100;
		return discountPrice;
	}
}
