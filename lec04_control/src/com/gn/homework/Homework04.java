package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int swDesign = 0;
        int swDev = 0;
        int dbBuild = 0;
        int pgLanguage = 0;
        int infoSysBuild = 0;
        String failSubjects = "";
        int avg = 0; 
        
        System.out.println("=== 합격인가? 불합격인가? ===");
        System.out.println("각 과목의 점수를 입력하세요.");
        System.out.print("소프트웨어설계 점수: ");
        swDesign = scanner.nextInt();
        System.out.print("소프트웨어개발 점수: ");
        swDev = scanner.nextInt();
        System.out.print("데이터베이스구축 점수: ");
        dbBuild = scanner.nextInt();
        System.out.print("프로그래밍언어활용 점수: ");
        pgLanguage = scanner.nextInt();
        System.out.print("정보시스템구축관리 점수: ");
        infoSysBuild = scanner.nextInt();
        avg = (swDesign + swDev + dbBuild + pgLanguage + infoSysBuild) / 5;

        if (swDesign < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "소프트웨어설계";
        }
        if (swDev < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "소프트웨어개발";
        }
        if (dbBuild < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "데이터베이스구축";
        }
        if (pgLanguage < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "프로그래밍언어활용";
        }
        if (infoSysBuild < 40) {
            failSubjects += (failSubjects.equals("") ? "" : ", ") + "정보시스템구축관리";
        }

        if (!failSubjects.equals("")) {
            System.out.println(failSubjects + " 과목 과락으로 불합격입니다.");
        } else if (avg < 60) {
            System.out.println("평균 점수 60점 미만으로 불합격입니다.");
        } else {
            System.out.println("합격을 축하합니다!");
        }

        scanner.close();
    }
}
