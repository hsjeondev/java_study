package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int marbleCount;
		String oddOrEven;
		
		System.out.print("구슬의 개수 : ");
		marbleCount = scanner.nextInt();
		
		oddOrEven = marbleCount % 2 == 0 ? "구슬의 개수는 짝수입니다." : "구슬의 개수는 홀수입니다.";
		
		System.out.println(oddOrEven);
	}

}
