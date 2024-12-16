package com.gn.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열(1) : ");
		String first = scanner.next();
		System.out.print("문자열(2) : ");
		String second = scanner.next();
		System.out.print("문자열(3) : ");
		String third = scanner.next();
		
		String[] arr = new String[3];
		arr[0] = first;
		arr[1] = second;
		arr[2] = third;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(arr[2].concat(arr[2]));

		scanner.close();
	}
}

// 내 원래 코드, 위에는 강사님이 알려주신 방법대로 한 코드. 강사님 대박..
//package com.gn.practice02;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("문자열(1) : ");
//		String one = scanner.next();
//		System.out.print("문자열(2) : ");
//		String two = scanner.next();
//		System.out.print("문자열(3) : ");
//		String three = scanner.next();
//		
//		long before = System.currentTimeMillis();
//
//		String result = "";
//		
//		if(one.length() == two.length() && two.length() == three.length() && one.length() == three.length()) {
//			if(one.compareTo(two) <= -1) {
//				result = two.compareTo(three) <= -1 ? three+three : two+two;
//			} else if(one.compareTo(two) >= 1) {
//				result = one.compareTo(three) <= -1 ? three+three : one+one;
//			} else if(one.compareTo(two) == 0) {
//				result = one.compareTo(three) == 0 ? one+one : one.compareTo(three) == -1 ? three+three : one+one; 
//			}
//		} else if(one.length() > two.length()) {
//			result = one+one;
//		} else if(two.length() > three.length()) {
//			result = two+two;
//		} else {
//			result = three+three;
//		}
//		
//		System.out.println(result);
//		long after = System.currentTimeMillis();
//		System.out.println(after-before);
//
//
//		scanner.close();
//	}
//
//}
//
