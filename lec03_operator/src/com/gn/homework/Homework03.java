package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int friendsCount;
		int candyCount;
		int peopleForCandy;
		int remain;
		
		System.out.print("친구 수 : ");
		friendsCount = scanner.nextInt();
		System.out.print("사탕의 수 : ");
		candyCount = scanner.nextInt();
		
		peopleForCandy = candyCount / friendsCount;
		remain = candyCount % friendsCount;
		
		System.out.println("1인당 사탕 개수 : " + peopleForCandy + "개");
		System.out.println("남는 사탕 개수 : " + remain + "개");
		
		scanner.close();
	}

}
