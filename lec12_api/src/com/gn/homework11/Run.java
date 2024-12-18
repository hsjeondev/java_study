package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		LocalTime start = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		System.out.println("기준 : " + dtf.format(start));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String answer = scanner.next();
			answer = answer.toUpperCase();
			
			switch(answer) {
			case "Y" :
				System.out.println("경과(초) : " + between(start));
				break;
			case "N" :
				System.out.println("종료합니다.");
				break;
			default :
				System.out.println("다시 입력해주세요.");
				break;
			}
			
			if(answer.equals("N")) {
				break;
			}
		}

		scanner.close();
	}
	
	public static long between(LocalTime start) {
		LocalTime end = LocalTime.now();
		
		return ChronoUnit.SECONDS.between(start, end);
	}

}
