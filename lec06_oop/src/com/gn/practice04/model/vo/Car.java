package com.gn.practice04.model.vo;

public class Car {

	public void startEngine() {
		System.out.println("자동차 시동이 켜졌습니다.");
	}
	
	public int checkSpeed() {
		int speed = 50;
		return speed;
	}
	
	public void setSpeed(int speed) {
		System.out.printf("속도가 %dkm/h로 설정되었습니다.\n", speed);
	}
	
	public String setDestination(String destination) {
		return "목적지가 설정되었습니다 : " + destination;
	}
	
	
	public void move(boolean way) {
		if(way) {
			System.out.println("전진");
		} else {
			System.out.println("후진");
		}
	}
}
