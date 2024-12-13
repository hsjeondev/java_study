package com.gn.practice11;

public class Fruit {
	
	private String name;
	private String origin;
	private int count;
	private int price;
	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, String origin, int count, int price) {
		super();
		this.name = name;
		this.origin = origin;
		this.count = count;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", origin=" + origin + ", count=" + count + ", price=" + price + "]";
	}

}
