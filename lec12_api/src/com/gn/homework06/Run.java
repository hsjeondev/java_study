package com.gn.homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
	        String sentence = "the quick brown fox jumps over the lazy dog";
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("문자열 입력 : ");
	        String userInput = scanner.next();
	        
	        String[] sentenceArr = sentence.split(" ");

	        boolean found = false;
	        for (int i = 0; i < sentenceArr.length; i++) {
	            if (sentenceArr[i].equals(userInput)) {
	            	found = true;
	                if (i + 1 < sentenceArr.length) {
	                    System.out.println(userInput + " 다음 단어: " + sentenceArr[i + 1]);
	                } else {
	                    System.out.println("미자막 단어입니다.");
	                }
	                break;
	            }
	        }
	        
	        if(!found) {
	        	System.out.println("존재하지 않는 단어입니다.");
	        }
	        
	        scanner.close();
	    }
	
}
