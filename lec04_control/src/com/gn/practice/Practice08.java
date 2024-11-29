package com.gn.practice;

public class Practice08 {

	public static void main(String[] args) {
		int stopNumber = 0;
		
		for(int i = 1; i <= 9; i++) {
			if(stopNumber == 45) {
				break;
			}
			System.out.printf("=== %d단 ===\n", i);
			for(int j = 1; j <= 9; j++) {
				stopNumber = i*j;
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}

	}

}
