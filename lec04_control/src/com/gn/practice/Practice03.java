package com.gn.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String gender;
		int hair;
		
		System.out.print("성별(F/M) : ");
		gender = scanner.next();
		System.out.print("머리(cm) : ");
		hair = scanner.nextInt();
		
		if(gender.equals("F")) {
			if(hair <= 7) {
				System.out.println("합격입니다.");
			} else {				
				System.out.println("불합격입니다.");
			}
		} else if(gender.equals("M")) {
			if(hair <= 3) {
				System.out.println("합격입니다.");
			} else {				
				System.out.println("불합격입니다.");
			}
		}
		
		scanner.close();
	}

}
