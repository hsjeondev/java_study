package com.gn.study.controller;

import com.gn.study.model.vo.Child;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Flower;
import com.gn.study.model.vo.Juice;
import com.gn.study.model.vo.Parent;
import com.gn.study.model.vo.Pizza;

public class Run {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();

		System.out.println();
		
		Parent p = new Parent();
		System.out.println(p.getA());
		Child c = new Child(1, 2); // 자식 생성자 호출 되면, 부모 생성자도 호출 됨
		System.out.println(c.getA());
		System.out.println();
		
		Juice juice = new Juice("트로피칼" , 500, "용과");
		
		juice.juiceInfo();
		
		System.out.println();


		Pizza pizza = new Pizza();
		pizza.printReaction();
		
		System.out.println();
		
		
		Flower f1 = new Flower("장미", "빨간색");
		Flower f2 = new Flower("장미", "빨간색");

		if(f1.equals(f2)) {
			System.out.println("똑같아요!");
		} else {
			System.out.println("X");
		}
		System.out.println();
		
		System.out.println(f1); // 객체를 표준 출력 하면은 자동으로 toString()이 됨.

	}
}
