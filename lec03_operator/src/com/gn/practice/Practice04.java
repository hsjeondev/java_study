package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// 철수가 지금 여권을 만드려고 함.
		// 영어 이름 : chulsu 맞나요?
		// 20대 이신가요?
		// 1. 철수의 영어 이름과 나이 정보를 입력 받기
		// 2. 3가지 논리형 데이터 출력
		
		// (1) 영어 이름이 일칠하나요? true
		// (2) 20대 인가요? false
		// (3) 영어 이름이 일치하면서 동시에 20대인가요? false
		
		Scanner scanner = new Scanner(System.in);
		String englishName = "chulsu";
		int minimumAge = 20;
		int maximumAge = 29;
		String inputName;
		int inputAge;
		boolean compareEnglishName;
		boolean compareAge;
		boolean compareEnglishNameAge;
		
		System.out.println("직원 : 영어 이름이 어떻게 되시나요?");
		System.out.print("영어 이름 입력 : ");
		inputName = scanner.next();
		System.out.println("철수 : " + inputName + "입니다.");
		System.out.println("직원 : chulls 맞으신가요?");
		System.out.println("철수 : 아니요. " + inputName + "입니다.");
		
		System.out.println("직원 : 20대이면 할인이 있는데, 나이가 어떻게 되시나요?");
		System.out.print("나이 입력 : ");
		inputAge = scanner.nextInt();
		System.out.println("철수 : " + inputAge + "살 입니다.");
		System.out.println();
		
		compareEnglishName = englishName.equals(inputName);
		compareAge = inputAge>=minimumAge && inputAge<=maximumAge;
		compareEnglishNameAge = compareEnglishName && compareAge;
		
		System.out.println("영어 이름 일치 여부 : " + compareEnglishName);
		System.out.println("20대 이상 여부 : " + compareAge);
		System.out.println("영어 이름 일치 여부와 20대 이상 여부 : " + compareEnglishNameAge);
		
		scanner.close();
	}

}
