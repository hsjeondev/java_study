package com.gn.homework01;

import java.io.File;

public class Run {

	public static void main(String[] args) {
		
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		Practice practice = new Practice();
		
		long method1Start = System.nanoTime();
		practice.method1(song);
		long method1End = System.nanoTime();
		System.out.println("FileOutputStream만 썼을 때 파일 생성 소요 시간 : " + (method1End - method1Start) + "나노초");
		
		long method2Start = System.nanoTime();
		practice.method2(song);
		long method2End = System.nanoTime();
		System.out.println("FileOutputStream만 썼을 때 파일 생성 소요 시간 : " + (method2End - method2Start) + "나노초");
		

	}

}
