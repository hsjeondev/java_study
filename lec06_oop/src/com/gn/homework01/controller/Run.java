package com.gn.homework01.controller;

import com.gn.homework01.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		employee1.name = "김철수";
		employee1.teamName = "교육운영팀";
		employee2.name = "이영희";
		employee2.teamName = "경영지원팀";
		
		System.out.print("이름 : " + employee1.name + ", ");
		System.out.println("팀 : " + employee1.teamName);
		System.out.print("이름 : " + employee2.name + ", ");
		System.out.println("팀 : " + employee2.teamName);
	}

}
