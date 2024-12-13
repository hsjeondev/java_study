package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Run {

	public static void main(String[] args) {
		
		Map<String, Planet> planets = new HashMap<String, Planet>();
		
		planets.put("Mars", new Planet("화성", 6779, 1.88));
		planets.put("Earth", new Planet("지구", 12742, 1.0));
		planets.put("Venus", new Planet("금성", 12104, 0.62));
		planets.put("Mercury", new Planet("수성", 4879, 0.24));
		
		System.out.println("*** keySet() 사용 ***");
		Set<String> planetsKeySet = planets.keySet();
		Iterator<String> keyIterator = planetsKeySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String name = planets.get(key).getName();
			int diameter = planets.get(key).getDiameter();
			double period = planets.get(key).getPeriod();
			System.out.println("행성 이름: " + key + "(" + name + "), 지름: " + diameter + " km, 공전주기: " + period + "년");
		}
		
		System.out.println("*** entrySet() 사용 ***");
		Set<Entry<String, Planet>> planetsEntrySet = planets.entrySet();
		Iterator<Entry<String, Planet>> entryIterator = planetsEntrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Planet> planet = entryIterator.next();
			String key = planet.getKey();
			Planet value = planet.getValue();
			System.out.println("키: " + key + ", 값: " + value);
		}
		
	}

}
