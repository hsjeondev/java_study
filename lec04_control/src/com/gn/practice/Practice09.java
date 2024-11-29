package com.gn.practice;

public class Practice09 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		while(true) {
			if(i == 6) {
				break;
			}
			System.out.println("반복 횟수: " + i);
			i++;
		}
		System.out.println("반복 종료!");
		System.out.println();
		
		while(j <= 5) {
			System.out.println("반복 횟수: " + j);
			j++;
		}
		System.out.println("반복 종료!");

	}

}
