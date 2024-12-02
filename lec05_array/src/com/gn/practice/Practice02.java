package com.gn.practice;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정수 배열 크기를 입력해주세요 : ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.print("정수 배열의 요소를 띄어쓰기로 입력해주세요 : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("50보다 큰 숫자 : ");
        for (int number : numbers) {
            if (number > 50) {
                System.out.print(number + " ");
            }
        }
        
        scanner.close();
    }
}