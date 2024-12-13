package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {

	public static void main(String[] args) {
		
		Map<String, Information> informations = new HashMap<String, Information>();
		
		informations.put("John", new Information("123-456-7890", 3800000));
		informations.put("Emma", new Information("987-654-3210", 2300000));
		informations.put("Tom", new Information("555-123-4567", 4600000));
	
		System.out.println("번경전 : " + informations);
		
//		informations.put("John", new Information("123-456-7890", 4100000));
		informations.get("John").setSalary(4100000);
		
		System.out.println();
		
		informations.get("Emma").setPhone("111-111-1111");
		System.out.println("===== Emma의 정보 =====");
		System.out.println("전화번호 : " + informations.get("Emma").getPhone());
		System.out.println("월급 : " + informations.get("Emma").getSalary());
		
		System.out.println();
		
		System.out.println("번경후 : " + informations);
	
	
	}

}
