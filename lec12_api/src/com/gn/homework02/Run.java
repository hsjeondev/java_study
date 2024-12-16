package com.gn.homework02;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		List<String> addresses = new ArrayList<String>();
		
		addresses.add("서울특별시 금천구 구로디지털2로 95");
		addresses.add("서울특별시 서대문구 연희로 248");
		addresses.add("울산광역시 남구 돋질로 233");
		addresses.add("경상북도 구미시 송정대로 55");
		
		Practice practice = new Practice();
		
		for(String address : addresses) {
			System.out.println(practice.takeState(address));
		}

	}

}
