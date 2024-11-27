package com.gn.study;

// 1. 외부에서 가져오기
import java.util.Scanner;

public class UserScanner {

	public static void main(String[] args) {
		// 2. Scanner 이름짓기
		Scanner scanner = new Scanner(System.in);
		// 3. 입력받기
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.println("이름 : " + name);
		
		// 정수 형태 데이터 입력받기
		System.out.print("점수 : ");
		int num = scanner.nextInt();
		System.out.println("점수 : " + num);
	}

}