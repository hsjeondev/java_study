package com.gn.homework10.controller;

public class BuilderController {

	public BuilderController() {}
	
	public String afterReplace(String str) {
		return str.replace(" ", "");
	}
	
	public String firstCap(String input) {
		
		String result = "";
		
		for(int i = 0; i < input.length(); i++) {
			if(i == 0) {
				result += String.valueOf(input.charAt(i)).toUpperCase();
				continue;
			}
			result += String.valueOf(input.charAt(i));
		}
		
		return result;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		
		return count;
	}
}
