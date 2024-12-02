package com.gn.practice;

public class Practice03 {

	public static void main(String[] args) {
		
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int attendance = 0;
		
		for(int att : attend) {
			attendance += att;
		}
		
		System.out.println("총 학생 수 : " + attend.length + "명");
		System.out.println("출석한 학생 수 : " + attendance + "명");
		System.out.println("결석한 학생 수 : " + (attend.length - attendance) + "명");

	}

}
