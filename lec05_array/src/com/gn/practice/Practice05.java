package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] scores = {54,23,98};
		int[] newScores = new int[scores.length+1];
		
		for(int i = 0; i < newScores.length; i++) {
			if(i == newScores.length-1) {
				System.out.print("길동이 : ");
				newScores[i] = scanner.nextInt();
				break;
			}
			newScores[i] = scores[i];
		}
		
		for(int score : newScores) {
			System.out.println(score);
		}
	
		int sum = 0;
		int avg = 0;
		
		for(int score : newScores) {
			sum += score;
		}
		System.out.println("총합 : " + sum);
		avg = sum / newScores.length;
		System.out.println("평균 : " + avg);
	}
}
