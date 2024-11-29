package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = 0;
		int temperature = 0;
		
		System.out.println("=== 일기예보 ===");
		System.out.print("월 : ");
		month = scanner.nextInt();
		System.out.print("기온 : ");
		temperature = scanner.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			if(temperature <= -15) {
				System.out.println("겨울 한파 경보");
			} else if(temperature <= -12) {
				System.out.println("겨울 한파 주의보");
			}
		} else if(month>=6 && month<=8) {
			if(temperature >= 35) {
				System.out.println("여름 폭염 경보");
			} else if(temperature >= 35) {
				System.out.println("여름 폭염 주의보");
			}
		} else {
			System.out.println("해당하는 계절 없음");
		}

		scanner.close();
	}

}
