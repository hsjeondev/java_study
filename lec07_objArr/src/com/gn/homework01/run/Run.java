package com.gn.homework01.run;

import java.util.Scanner;
import com.gn.homework01.model.vo.Student;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "";

        Student[] students = new Student[3];
        int index = 0;

        while (true) {

            if (index == students.length) {
                System.out.println("배열이 다 찼습니다. 더 이상 입력할 수 없습니다.");
                break;
            }

            students[index] = new Student();
            System.out.print("학년 : ");
            int grade = scanner.nextInt();
            students[index].setGrade(grade);
            System.out.print("반 : ");
            int classroom = scanner.nextInt();
            students[index].setClassroom(classroom);
            System.out.print("이름 : ");
            String name = scanner.next();
            students[index].setName(name);
            System.out.print("국어점수 : ");
            int kor = scanner.nextInt();
            students[index].setKor(kor);
            System.out.print("영어점수 : ");
            int eng = scanner.nextInt();
            students[index].setEng(eng);
            System.out.print("수학점수 : ");
            int math = scanner.nextInt();
            students[index].setMath(math);

            while (true) {
                System.out.print("계속 추가하시겠습니까? (y/n): ");
                answer = scanner.next();

                char firstChar = answer.charAt(0);
                if (firstChar == 'n' || firstChar == 'N') {
                    break;
                } else if (firstChar == 'y' || firstChar == 'Y') {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 'y' 또는 'n'을 입력하세요.");
                }
            }

            if (answer.charAt(0) == 'n' || answer.charAt(0) == 'N') {
                break;
            }

            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(students[i].information());
        }

        scanner.close();
    }
}
