package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String ownSpeak;
		String parrotSpeak;
		
		System.out.print("말해보세요 : ");
		ownSpeak = scanner.next();
		
		if(ownSpeak.equals("간다")) {
			parrotSpeak = "온다";
		} else {
			parrotSpeak = "..?";
		}
		
		System.out.println("앵무새 : " + parrotSpeak);
		
		scanner.close();
	}

}
