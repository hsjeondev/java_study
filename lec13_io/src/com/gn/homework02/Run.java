package com.gn.homework02;

public class Run {

	public static void main(String[] args) {
		
		Practice practice = new Practice();
		
		long leadTime1 = practice.method1("C:\\test\\sub\\나비야1.dat");
		System.out.println("FileInputStream만 썼을 때 소요 시간 : " + leadTime1);
		
		System.out.println();
		
		long leadTime2 = practice.method2("C:\\test\\sub\\나비야1.dat");
		System.out.println("BufferedInputStream과 같이 썼을 때 소요 시간 : " + leadTime2);

	}

}
