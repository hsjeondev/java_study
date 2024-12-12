package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {

	public static void main(String[] args) {

		Set<Equipment> equipments1 = new HashSet<Equipment>();
		equipments1.add(new Equipment("라켓", 15000));
		equipments1.add(new Equipment("배트", 6000));
		equipments1.add(new Equipment("축구공", 3000));
		Set<Equipment> equipments2 = new HashSet<Equipment>();
		equipments2.add(new Equipment("배트", 6000));
		equipments2.add(new Equipment("야구공", 5000));
		equipments2.add(new Equipment("글러브", 9000));
		
		Set<Equipment> union = new HashSet<Equipment>(equipments1);
		union.addAll(equipments2);
		Set<Equipment> intersection = new HashSet<Equipment>(equipments1);
		intersection.retainAll(equipments2);
		Set<Equipment> difference = new HashSet<Equipment>(equipments1);
		difference.removeAll(equipments2);
		
		System.out.println("*** 합집합 ***");
		Iterator<Equipment> unionIterator = union.iterator();
		while(unionIterator.hasNext()) {
			Equipment equipment = unionIterator.next();
			System.out.println(equipment);
		}
		
		System.out.println("*** 교집합 ***");
		Iterator<Equipment> interIterator = intersection.iterator();
		while(interIterator.hasNext()) {
			Equipment equipment = interIterator.next();
			System.out.println(equipment);
		}
		
		System.out.println("*** 차집합 ***");
		Iterator<Equipment> diffIterator = difference.iterator();
		while(diffIterator.hasNext()) {
			Equipment equipment = diffIterator.next();
			System.out.println(equipment);
		}
		
	}

}
