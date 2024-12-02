package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		int size = scanner.nextInt();
		System.out.print("학생들의 나이를 띄어쓰기로 입력해주세요 : ");
		int[] ages = new int[size];
		
		for(int i = 0; i < ages.length; i++) {
			ages[i] = scanner.nextInt();
		}
		
		int max = ages[0];
		int min = ages[0];
		
		for(int age : ages) {
			if(age > max) {
				max = age;
			}
			
			if(age < min) {
				min = age;
			}
		}
		
		System.out.println("가장 나이가 많은 학생의 나이 : " + max);
		System.out.println("가장 나이가 어린 학생의 나이 : " + min);
		
		scanner.close();
	}

}
