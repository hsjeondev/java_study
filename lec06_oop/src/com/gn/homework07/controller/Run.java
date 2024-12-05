package com.gn.homework07.controller;

import com.gn.homework07.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setEmpNo(100);
		employee.setEmpName("홍길동");
		employee.setDept("영업부");
		employee.setJob("과장");
		employee.setAge(25);
		employee.setGender('남');
		employee.setSalary(3000000);
		employee.setBonus(0.05);
		employee.setPhone("010-123-4567");
		employee.setAddress("서울시 강남구");
		
		System.out.printf("=== %s의 정보 ===\n", employee.getEmpName());
		System.out.println("사번 : " + employee.getEmpNo());
		System.out.println("부서 : " + employee.getDept());
		System.out.println("직급 : " + employee.getJob());
		System.out.println("나이 : " + employee.getAge());
		System.out.println("월급 : " + employee.getSalary());
		System.out.println("전화번호 : " + employee.getPhone());
		System.out.println("주소 : " + employee.getAddress());
	}

}
