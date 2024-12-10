package com.gn.practice01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int x = scanner.nextInt();
		System.out.print("두 번째 숫자 : ");
		int y = scanner.nextInt();
		
		Practice practice = new Practice();
		int add = practice.add(x, y);
		System.out.println("합 : " + add);
		int mul = practice.multiple(x, y);
		System.out.println("곱 : " + mul);
		
		try {
			int div = practice.divide(x, y);
			System.out.println("나누기 : " + div);
		} catch (ArithmeticException e) {
			System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
		} finally {
			System.out.print("마지막까지 잘 도착했어요!!");
		}

		scanner.close();
	}

}
