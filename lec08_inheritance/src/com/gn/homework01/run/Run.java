package com.gn.homework01.run;

import java.util.Scanner;
import com.gn.homework01.model.vo.Employee;
import com.gn.homework01.model.vo.Student;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = "";

        Student[] students = new Student[3];

        students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
        students[2] = new Student("홍길동", 21, 197.6, 86, 2, "경영학과");

        for (Student student : students) {
            System.out.println(student.toString());
        }

        Employee[] employees = new Employee[2];
        int employeeIndex = 0;

        
        
        System.out.println("=== 사원 입력받기 ===");
        while (true) {

            System.out.print("이름: ");
            String name = scanner.next();
            System.out.print("나이: ");
            int age = scanner.nextInt();
            System.out.print("키: ");
            double height = scanner.nextDouble();
            System.out.print("몸무게: ");
            double weight = scanner.nextDouble();
            System.out.print("급여: ");
            int salary = scanner.nextInt();
            System.out.print("부서: ");
            String dept = scanner.next();

            employees[employeeIndex++] = new Employee(name, age, height, weight, salary, dept);

            if (employeeIndex == employees.length) {
                System.out.println("사원 정보를 더 이상 입력할 수 없습니다. 배열이 가득 찼습니다.");
                break;
            }

            while (true) {
                System.out.print("계속 추가하시겠습니까? (y/n): ");
                answer = scanner.next();

                if (answer.equalsIgnoreCase("y")) {
                    break;
                } else if (answer.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }

            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }

        for (int i = 0; i < employeeIndex; i++) {
            System.out.println(employees[i].toString());
        }

        scanner.close();
    }
}
