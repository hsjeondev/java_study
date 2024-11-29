package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		int checkNum;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		checkNum = scanner.nextInt();
		
		if(checkNum > 0) {
			System.out.println("숫자 : " + checkNum);
			System.out.println("양수입니다.");
		}
		
		scanner.close();
	}

}
