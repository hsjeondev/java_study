package com.gn.practice01;

public class Run {

	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		int[] src = new int[1000000];
		int[] dct = new int[src.length/2];
		
		for(int i = 0; i < src.length; i++) {
			int random = (int)(Math.random() * 100) + 1;
			src[i] = random;
		}
		
		System.arraycopy(src, 0, dct, 0, src.length/2);
		
		int index = 0;
		for(int i = 0; i < dct.length/10; i++) {
			for(int j = 0; j < dct.length/50000; j++) {
				if(j == dct.length/50000-1) {
					System.out.print(dct[index++]);
				} else {
					System.out.print(dct[index++] + ", ");					
				}
			}
			System.out.println();
		}
		
		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간: "+ (after-before) + "ms");

	}

}
