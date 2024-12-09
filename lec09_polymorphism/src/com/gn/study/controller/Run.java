package com.gn.study.controller;

import com.gn.study.model.vo.Alarm;
import com.gn.study.model.vo.Animal;
import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Cat;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Earth;
import com.gn.study.model.vo.FireAlarm;
import com.gn.study.model.vo.Mars;
import com.gn.study.model.vo.OrangeJuice;
import com.gn.study.model.vo.Planet;

public class Run {

	public static void main(String[] args) {
		// 1. 클래스의 업캐스팅
		int i_num = 3;
		double d_num = i_num;
		System.out.println(d_num);
		
		Beverage b1 = new Coffee();
		Beverage b2 = new OrangeJuice();
		
		b1.drink();
		b2.drink();
		
		System.out.println();
		
		// 2. 객체 배열과 다형성
		Beverage[] arr = new Beverage[3];
		
		Beverage bev = new Beverage();
		arr[0] = bev;
		
		Coffee cof = new Coffee();
		arr[1] = cof;
		
		OrangeJuice oj = new OrangeJuice();
		arr[2] = oj;
		
		for(Beverage b : arr) {
			b.drink();
		}
		
		System.out.println();
		
		// 3. 클래스 다운캐스팅
		// (Coffee)b1.ice(); -> b1.ice()의 메소드를 부르는 것임 그래서 안 됨.
		((Coffee)b1).ice();
		((OrangeJuice)b2).fresh();
		
		Coffee b3 = new Coffee();
		b3 = (Coffee)b1;
		b3.ice();
		
		for(Beverage b : arr) {
			b.drink();
			// 만약에 진짜 데이터가 Coffee면 ice()메소드 호출
			if(b instanceof Coffee) {
				((Coffee) b).ice();
			}
			// 만약에 진짜 데이터가 OrangeJuice면 fresh() 메소드 호출
			else if(b instanceof OrangeJuice) {
				((OrangeJuice) b).fresh();
			}
			
//			System.out.println("instanceof로 확인을 안 하면");
//			((Coffee)b).ice(); // b에는 OrangeJuice에도 들어 있으니 타입캐스팅 오류가 남
		}
		
		System.out.println();
		System.out.println("===============================");
		System.out.println();
		
		// 4. 정적 바인딩 -> 오버로딩
		// 코드를 쓴 후 정상인지 판단 후 컴파일 됨
		// 저장할 때 컴파일된다고 생각하면 됨
		// 매개변수만 봐도 어떤 메소드인지 알 수 있음.
		Planet myPlanet = new Planet();
		myPlanet.description();
		myPlanet.description(46);
		
		// 5. 동적 바인딩 
		// -> 컴파일시점에서는  material이 Planet꺼인지, Earth꺼인지, Mars꺼인지 모름.
		// 실행하면 p1을 까보니까 지구가 들어가 있음. Override된 것 있으면 그거 실행.
		// 참조변수만 보고는 Planet꺼인 줄 알았는데, 구현체를 보니까 Earth꺼구나
		Planet p1 = new Earth();
		Planet p2 = new Mars();
		p1.material();
		p2.material();
		
		System.out.println();
		System.out.println("===============================");
		System.out.println();
		
		// 6. 추상 메소드
		Animal dog = new Dog();
		dog.sound();
		Animal cat = new Cat();
		cat.sound();
		
		System.out.println();
		
		// 7. 인터페이스
		Alarm a = new FireAlarm();
		System.out.println(Alarm.MAX_VOLUME);
		a.soundAlarm();
	}

}
