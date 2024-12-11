package com.gn.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {

	public static void main(String[] args) {
		
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		System.out.println("초기 좌석 목록: " + seats);
		
		seats.add(2, "A3");
		System.out.println("A3 좌석 추가 후: " + seats);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("예약 좌석 : ");
		String bookAnswer = scanner.next();
		
		if(seats.contains(bookAnswer)) {
			int index = seats.indexOf(bookAnswer);
			String bookSeat = bookAnswer + "(예약)";
			seats.set(index, bookSeat);
		} else {
			System.out.println(bookAnswer + "은(는) 존재하지 않는 좌석입니다.");
		}
		System.out.println("좌석 예약 후 : " + seats);
		
		System.out.print("삭제 좌석 : ");
		String removeAnswer = scanner.next();
		
		if(seats.contains(removeAnswer)) {
			int index = seats.indexOf(removeAnswer);
			seats.remove(index);
		} else {
			System.out.println(removeAnswer + " 좌석은 목록에 없습니다.");
		}
		System.out.println("좌석 삭제 후 : " + seats);
		
		Collections.sort(seats);
		System.out.println("좌석 정렬 후: " + seats);
		
		
		scanner.close();
	}

}
