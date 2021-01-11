package com.java.test1;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		//Scanner 객체 -> scanner 객체 새로 생성
		Scanner scanner = new Scanner(System.in);

		String inputString;

		do {
			System.out.print(">");
			//nextLine() : 엔터치기 전까지 문자열 저장
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}
		//대소문자 구분 x
		while (!inputString.equals("q"));
		//대소문자 구분 o
//		while (!inputString.equalsIgnoreCase("q"));
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
