package com.gn.practice01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Practice practice = new Practice();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자를 입력해주세요 : ");
			String str1 = scanner.next();
			System.out.print("두 번째 숫자를 입력해주세요 : ");
			String str2 = scanner.next();
			
			try {
				practice.printSum(str1, str2);
				break;
			} catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
				System.out.println();
			}
		}
		
		scanner.close();
	}

}
