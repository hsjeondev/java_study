package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age;
		int fare = 0;
		
		System.out.println("=== 놀이동산 입장료 계산하기===");
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		if(age <= 0){
			System.out.println("말이 된다고 생각하십니까?");
			return;
		}else if(age < 3 || age >= 65) {
			fare = 0;
		} else if(age <= 12) {
			fare = 10000;
		} else if(age <= 18) {
			fare = 20000;
		} else if(age <= 64) {
			fare = 30000;
		} 

		if(fare == 0) {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		} else {
			System.out.println("당신의 놀이동산 요금은 " + fare + "원입니다.");
		}
		
		scanner.close();
	}

}
