package com.gn.practice04;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product("사과", 1000));
		products.add(new Product("바나나", 2000));
		products.add(new Product("딸기", 3000));
		
		System.out.println("=== for each로 조회 ===");
		for(Product product : products) {
			System.out.println(product);
		}
		
		products.remove(1);
		products.set(0, new Product("오렌지", 1500));
		
		System.out.println("=== 기본 for문으로 조회 ===");
		for(int i = 0; i < products.size(); i++) {
			System.out.println(i + " : " + products.get(i));
		}

	}

}
