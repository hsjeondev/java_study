package com.gn.study.model.vo;

public class Product implements Comparable<Product> {
	private String name;
	private int price;
	
	public Product() {}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}


//	@Override
//	public int compareTo(Product other) {
//		return this.price-other.price;
//	}
	
	@Override
	public int compareTo(Product other) {
		return this.name.compareTo(other.name);
	}
	
	@Override
	public String toString() {
		return name + " : " + price;
	}

}
