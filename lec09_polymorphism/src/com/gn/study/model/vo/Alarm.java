package com.gn.study.model.vo;

public interface Alarm {
	// 상수 필드 -> 인터페이스는 무조건 public static final이기 때문에 생략 가능
	// 상수 -> 변수명 대문자, 스네이크 케이스(인터페이스와는 무관)
	public static final int MAX_VOLUME = 10;
	// int MAX_VOLUME = 10;
	
	// 추상 메소드 -> 인터페이스는 무조건 public abstract이기 때문에 생략 가능
	public abstract void soundAlarm();
	// void soundAlarm();
}
