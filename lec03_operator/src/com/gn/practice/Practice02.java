package com.gn.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int result = scanner.nextInt();
		System.out.println();
		
		System.out.println("입력한 숫자 " + result + "을(를) 복합 대입 연산 한 결과:");
		System.out.print(result);
		result += 3;
		System.out.println(" + 3 = " + result);
		System.out.print(result);
		result -= 10;
		System.out.println(" - 10 = " + result);
		System.out.print(result);
		result *= 2;
		System.out.println(" * 2 = " + result);
		System.out.print(result);
		result /= 3;
		System.out.println("을 3으로 나눈 후 몫 : " + result);
		System.out.print(result);
		result %= 6;
		System.out.println("을 6으로 나눈 후 나머지 : " + result);

		scanner.close();
	}

}
