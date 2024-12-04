package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Library;
import com.gn.study.method.model.vo.Smartphone;

public class Run {

	public static void main(String[] args) {
		// 객체 생성
		// 인스턴스화
		Smartphone myPhone = new Smartphone();
		
		System.out.println("============");
		myPhone.checkWork();
		System.out.println("============");
		System.out.println();
		
		// 1. 반황형X, 매개변수X
		myPhone.opeanApp();
		
		// 2. 반환형O, 매개변수X
		int battery = myPhone.checkBattery();
		System.out.println(battery);
		System.out.println(myPhone.checkBattery());
		
		// 3. 반환형X, 매개변수O
		myPhone.setVolume(15);
		
		// 4. 반환형O, 매개변수O
		String result = myPhone.sendMsg("자니?");
		System.out.println(result);
		System.out.println();
		
		
		// 객체화
		Library library = new Library();
		
		library.borrowBooks("해리포터", "반지의 제왕", "데미안", "채식주의자");
		System.out.println();
		library.returnBooks(1000, "해리포터", "반지의 제왕", "데미안", "채식주의자");
		System.out.println();
		
		// 객체화
		Hospital hospital = new Hospital();
		
		hospital.emergencyCall();
//		hospital.doctorCall();
//		hospital.staffAnnouncement();
//		hospital.personalRecord();
		System.out.println();
		
		// 인스턴스를 생성하지 않고 메소드 호출 가능
		Hospital.hospitalInfo(); // 권장
		hospital.hospitalInfo(); // 비추천
		
		
	}
}
