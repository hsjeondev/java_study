package com.gn.homework.two;

import java.util.Scanner;

public class Practice {

	public void practice01() { // 거꾸로 4 x 4 배열
		
		int[][] arr = new int[4][4];
		
		System.out.println("=== 거꾸로 4 x 4 배열 ===");
		
		int num = 16;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = num--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] +  " ");
			}
			System.out.println();
		}
	}
	
	public void practice02() { // 랜덤 4 x 4 배열
		
		int[][] arr = new int[4][4];
		
		System.out.println("=== 랜덤 4 x 4 배열 ===");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int random = (int)(Math.random() * (10 -1 + 1)) + 1;
				arr[i][j] = random;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] +  " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice03() { // 알파벳 랜덤 2차원 배열
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 알파벳 랜덤 2차원 배열 ===");
		System.out.print("행 : ");
		int row = scanner.nextInt();
		System.out.print("열 : ");
		int col = scanner.nextInt();
		char[][] arr = new char[row][col];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int random = (int)(Math.random() * (90 - 65 + 1)) + 65;
				arr[i][j] = (char)random;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
	
	public void practice04() { // 문장 출력하기
		String[][] strArr 
		= new String[][] {{"이", "까", "왔", "앞", "힘"}, 
		{"차", "지", "습", "으", "냅"}, 
		{"원", "열", "니", "로", "시"}, 
		{"배", "심", "다", "좀", "다"}, 
		{"열", "히", "! ", "더", "!! "}};
		
		System.out.println("=== 문장 출력하기 ===");
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}	
		
	}
	
	public void practice05() { // 자리 배치하기
		
		String[][] firstSection = 
			{{"강건강", "남나나"},{"도대담", "류라라"},{"문미미", "박보배"}};
		String[][] secondSection =
			{{"송성실", "윤예의"},{"진재주", "차천축"},{"피풍표", "홍하하"}};
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < firstSection.length; i++) {
			for(int j = 0; j < firstSection[i].length; j++) {
				System.out.print(firstSection[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < secondSection.length; i++) {
			for(int j = 0; j < secondSection[i].length; j++) {
				System.out.print(secondSection[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice06() { // 학생의 위치 출력
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] firstSection = 
			{{"강건강", "남나나"},{"도대담", "류라라"},{"문미미", "박보배"}};
		String[][] secondSection =
			{{"송성실", "윤예의"},{"진재주", "차천축"},{"피풍표", "홍하하"}};
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < firstSection.length; i++) {
			for(int j = 0; j < firstSection[i].length; j++) {
				System.out.print(firstSection[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < secondSection.length; i++) {
			for(int j = 0; j < secondSection[i].length; j++) {
				System.out.print(secondSection[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String findName = scanner.next();
		String[] row = {"첫 번째 줄", "두 번째 줄", "세 번째 줄"};
		String[] col = {"왼쪽", "오른쪽"};
		
		for(int i = 0; i < firstSection.length; i++) {
			for(int j = 0; j < firstSection[i].length; j++) {
				if(firstSection[i][j].equals(findName)) {
					System.out.printf("검색하신 %s 학생은 1분단 %s %s에 있습니다.", findName, row[i], col[i]);
					break;
				}
				if(secondSection[i][j].equals(findName)) {
					System.out.printf("검색하신 %s 학생은 2분단 %s %s에 있습니다.", findName, row[i], col[i]);
					break;
				}
			}
		}

		scanner.close();
	}
	
}
