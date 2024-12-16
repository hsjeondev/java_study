package com.gn.practice05;

public class Run {

	public static void main(String[] args) {
		
		String[] words = {"java", "application", "programming", "interface"};
		
		String joinWords = String.join(" ", words);
		String upperWords = joinWords.toUpperCase();
		
		String result = "";
		
		result = upperWords.substring(5,6);
		result += upperWords.substring(17,18);
		result += upperWords.substring(29,30);
		
		System.out.println("문장 : " + joinWords);
		System.out.println("변환 : " + result);

	}

}
