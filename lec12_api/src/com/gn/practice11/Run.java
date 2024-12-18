package com.gn.practice11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + dtf.format(today));
		
		LocalDateTime openDay = LocalDateTime.of(2024, 12, 25, 00, 00, 00);
		long between = ChronoUnit.DAYS.between(today, openDay);
		System.out.println("영화 개봉까지 남은 날 : " + between + "일");
		
		int intDayOfWeek = openDay.getDayOfWeek().getValue();
		System.out.println("영화 개봉일의 요일 : " + getKorenDayOfWeek(intDayOfWeek));
		
		System.out.println("개봉일 : " + dtf.format(openDay));

	}
	
	public static String getKorenDayOfWeek(int day) {
		String result = "";
		
		switch(day) {
		case 1:
			result = "월요일";
			break;
		case 2:
			result = "화요일";
			break;
		case 3:
			result = "수요일";
			break;
		case 4:
			result = "목요일";
			break;
		case 5:
			result = "금요일";
			break;
		case 6:
			result = "토요일";
			break;
		case 7:
			result = "일요일";
			break;
		default:
			result = null;
			break;
		}
		
		return result;
	}

}
