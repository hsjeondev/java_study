package com.gn.practice04;

public class Practice {

	public String deleteBlank(String str) {
		String result = str;
		result = result.replace(" ", "").trim();
		
		return result;
	}
}
