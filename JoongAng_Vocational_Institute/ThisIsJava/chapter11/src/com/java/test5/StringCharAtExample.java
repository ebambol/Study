package com.java.test5;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "010624-1231230";
		char sex = ssn.charAt(7);
		//만약 index7존재 하지 않는 문자열이면 에러발생
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력 > ");
//		String a = scanner.next();
//		char sex = a.charAt(7);
//		//만약 index7존재 하지 않는 문자열이면 에러발생
//		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
//		switch (sex) {
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자");
//			break;
//		default:
//			System.out.println("틀림");
//		}
	}

}
