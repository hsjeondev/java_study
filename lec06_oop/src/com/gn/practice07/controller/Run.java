package com.gn.practice07.controller;

import com.gn.practice07.model.vo.Supplement;

public class Run {

	public static void main(String[] args) {
		
		Supplement supplement1 = new Supplement("유산균", 1, 18000);
		Supplement supplement2 = new Supplement("비타민B", 1, 15000);
		Supplement supplement3 = new Supplement("루테인", 2, 20000);
		Supplement supplement4 = new Supplement("비타민D", 1, 12000);
		
		Supplement[] supplements = {supplement1, supplement2, supplement3, supplement4};

		System.out.println("========== 영양제 목록 ==========");
		for(Supplement supplement : supplements) {
			supplement.printSupplementInfo();
		}
		
	}

}
