package com.gn.homework03.controller;

import com.gn.homework03.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		boolean in = false;
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				in = true;
				break;
			}
			if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122) ) {
				count++;
			}
		}
		
		if(in) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		} else {
			return count;
		}
	}
}
