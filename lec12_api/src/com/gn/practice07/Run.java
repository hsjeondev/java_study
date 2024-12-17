package com.gn.practice07;

public class Run {

	public static void main(String[] args) {
		
		double pi = 5.13824;
		
		System.out.println("소수점 첫째자리까지 반올림 : " + Math.round(pi*Math.pow(10, 1)) / Math.pow(10, 1));
		System.out.println("소수점 둘째자리까지 반올림 : " + Math.round(pi*Math.pow(10, 2)) / Math.pow(10, 2));
		System.out.println("소수점 셋째자리까지 반올림 : " + Math.round(pi*Math.pow(10, 3)) / Math.pow(10, 3));

	}

}
