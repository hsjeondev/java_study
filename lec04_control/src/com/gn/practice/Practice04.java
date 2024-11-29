package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int switchNumber;
		String nowLighting;
		
		System.out.print("조명의 밝기를 입력하세요 (0~3):");
		switchNumber = scanner.nextInt();
		
		switch(switchNumber) {
			case 0 :
				nowLighting = "조명을 끕니다.";
				break;
			case 1 :
				nowLighting = "어두운 조명입니다.";
				break;
			case 2 :
				nowLighting = "밝은 조명입니다.";
				break;
			case 3 :
				nowLighting = "매우 밝은 조명입니다.";
				break;
			default : 
				nowLighting = "올바른 입력이 아닙니다.";
				break;
		}
		
		System.out.println("현재 조명의 밝기 : " + nowLighting + " (V)");
		
		scanner.close();
	}

}
