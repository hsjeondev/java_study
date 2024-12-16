package com.gn.practice03;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String userInput = scanner.next();
        
        String[] sentenceArr = sentence.split(" ");

        boolean found = false;
        for (int i = 0; i < sentenceArr.length; i++) {
            if (sentenceArr[i].equals(userInput)) {
            	found = true;
                if (i + 1 < sentenceArr.length) {
                    System.out.println(sentenceArr[i + 1]);
                } else {
                    System.out.println("다음 단어가 없습니다.");
                }
                break;
            }
        }
        
        if(!found) {
        	System.out.println("단어가 존재하지 않습니다.");
        }
        
        scanner.close();
    }
}
