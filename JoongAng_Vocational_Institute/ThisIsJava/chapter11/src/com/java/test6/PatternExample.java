package com.java.test6;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";	//���� ǥ���� ���ڿ�
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);	//data�� regExp�� �����ϴ��� Ȯ��
		System.out.println(result);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ����ġ�մϴ�.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";	//true
		data = "angel@naver.co.kr";	//true
		data = "angel@navercom";	//false
		data = "angel@naver.co.kr.com";	//false
		data = "1a@naver.com";	//true
		data = "ȫ�浿@naver.com";	//false
		result = Pattern.matches(regExp, data);
		System.out.println(result);
		if(result) {
			System.out.println(data+" �� �̸��� �ּ� ������ �½��ϴ�.");
		} else {
			System.out.println(data+" �� �̸��� �ּ� ������ �ƴմϴ�.");
		}
	}
	
}
