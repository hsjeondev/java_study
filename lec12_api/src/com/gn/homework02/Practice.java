package com.gn.homework02;

public class Practice {

	public String takeState(String address) {
		String result = "";
		
		result = address.substring(address.indexOf(' ') + 1, address.lastIndexOf(' '));
		String[] city = result.split(" ");
		
		if(city[0].charAt(city[0].length()-1) != '구') {
			result = null;
		} else {
			result = city[0];
		}
		
		return result;
	}
}
