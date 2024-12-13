package com.gn.practice11;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Run {

	public static void main(String[] args) {
		
		Map<Integer, Fruit> fruits = new TreeMap<Integer, Fruit>();
		
		fruits.put(3, new Fruit("귤", "제주", 10, 15000));
		fruits.put(4, new Fruit("배", "나주", 7, 50000));
		fruits.put(1, new Fruit("포도", "강화도", 3, 35000));
		fruits.put(2, new Fruit("사과", "영주", 5, 20000));
		
		System.out.println("=== 전체 데이터 조회 ===");
		Set<Integer> keySet = fruits.keySet();
		Iterator<Integer> iteratorKey = keySet.iterator();
		while(iteratorKey.hasNext()) {
			int key = iteratorKey.next();
			System.out.println(key + " : " +fruits.get(key));
		}
		
		System.out.println("=== 가격 20000원 이상 ===");
		Set<Entry<Integer, Fruit>> entrySet = fruits.entrySet();
		Iterator<Entry<Integer, Fruit>> iteratorEntry = entrySet.iterator();
		while(iteratorEntry.hasNext()) {
			Entry<Integer, Fruit> entry = iteratorEntry.next();
			int key = entry.getKey();
			Fruit fruit = entry.getValue();
			if(fruit.getPrice() >= 20000) {
				System.out.println(key + " : " +fruit);
			}
		}
		
		System.out.println("=== 이름이 한글자인 과일 ===");
		iteratorKey = keySet.iterator();
		while(iteratorKey.hasNext()) {
			int key = iteratorKey.next();
			if(fruits.get(key).getName().length() == 1) {
				System.out.println(key + " : " +fruits.get(key));
			}
		}
		
		System.out.println("=== 포도 가격 인상 ===");
		iteratorEntry = entrySet.iterator();
		while(iteratorEntry.hasNext()) {
			Entry<Integer, Fruit> entry = iteratorEntry.next();
			int key = entry.getKey();
			Fruit fruit = entry.getValue();
			if(fruit.getName().equals("포도")) {
				fruit.setPrice(28000);
				System.out.println(key + " : " +fruit);
			}
		}
	}

}
