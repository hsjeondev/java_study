package com.gn.practice02;

public class Run {

	
	public static void main(String[] args) {
		
		Pair<String, Integer> pair = new Pair<String, Integer>("Apple", 10);
	
		System.out.println("First : " + pair.getFirst());
		System.out.println("Second : " + pair.getSecond());
	}
}
