package com.gn.study.controller;

public class SystemRun {

	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		// 1. arraycopy()
		int[] src = {10,15,20,25,30};
		int[] dst = new int[src.length];
//		for(int i = 0; i < src.length; i++) {
//			dst[i] = src[i];
//		}
		System.arraycopy(src, 0, dst, 0, src.length);
		for(int d : dst) {
			System.out.print(d + " | ");
		}
		System.out.println();
		// 2. currentTimeMillis()
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		long after = System.currentTimeMillis();
		System.out.println((after-before) + "밀리초 걸림");
	}

}
