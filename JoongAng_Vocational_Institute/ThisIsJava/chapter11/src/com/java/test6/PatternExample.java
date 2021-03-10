package com.java.test6;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";	//정규 표현식 문자열
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);	//data가 regExp에 만족하는지 확인
		System.out.println(result);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 불일치합니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";	//true
		data = "angel@naver.co.kr";	//true
		data = "angel@navercom";	//false
		data = "angel@naver.co.kr.com";	//false
		data = "1a@naver.com";	//true
		data = "홍길동@naver.com";	//false
		result = Pattern.matches(regExp, data);
		System.out.println(result);
		if(result) {
			System.out.println(data+" 는 이메일 주소 형식이 맞습니다.");
		} else {
			System.out.println(data+" 는 이메일 주소 형식이 아닙니다.");
		}
	}
	
}
