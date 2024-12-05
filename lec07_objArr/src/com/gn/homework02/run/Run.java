package com.gn.homework02.run;

import com.gn.homework02.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee(1, "이영희", 19, 'M', "01022223333", "가산");
		Employee employee3 = 
				new Employee(2, "김철수", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "구디");
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		
		for(int i = 0; i < employees.length; i++) {
			System.out.printf("emp[%d] : %s\n", i, employees[i].information());
		}
		System.out.println("=================================================================");
		
		employees[0].setEmpNo(0);
		employees[0].setEmpName("홍길동");
		employees[0].setDept("영업부");
		employees[0].setJob("팀장");
		employees[0].setAge(30);
		employees[0].setGender('M');
		employees[0].setSalary(3000000);
		employees[0].setBonusPoint(0.2);
		employees[0].setPhone("01055559999");
		employees[0].setAddress("금천구");
		
		employees[1].setDept("기획부");
		employees[1].setJob("부장");
		employees[1].setSalary(4000000);
		employees[1].setBonusPoint(0.3);
		
		for(int i = 0; i < employees.length-1; i++) {
			System.out.printf("emp[%d] : %s\n", i, employees[i].information());
		}
		System.out.println("=================================================================");
		
		for(Employee employee : employees) {
			double annualSalary = employee.getSalary() * 12 * (1 + employee.getBonusPoint());
			System.out.printf("%s의 연봉 : %d원\n", employee.getEmpName(), (int)annualSalary);
		}
		
		System.out.println("=================================================================");
		int avgAnnualSalary = 0;
		for(Employee employee : employees) {
			avgAnnualSalary += (int)(employee.getSalary() * 12 * (1 + employee.getBonusPoint()));
		}
		System.out.println("직원들의 연봉의 평균 : " + (int)avgAnnualSalary / employees.length + "원");
	}

}
