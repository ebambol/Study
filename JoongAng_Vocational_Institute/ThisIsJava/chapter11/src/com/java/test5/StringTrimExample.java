package com.java.test5;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123    ";
		String tel3 = "   1234    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		
		//trim() 문자열 앞과 뒤으 ㅣ공백을 제거함
		//하지만, 문자열(문자) 사이의 공백은 제거하지 못한다.
		System.out.println(tel);
	}
}
