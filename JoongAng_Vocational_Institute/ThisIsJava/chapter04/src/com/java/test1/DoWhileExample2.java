package com.java.test1;

import java.util.Scanner;

public class DoWhileExample2 {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		//Scanner 객체 -> scanner 객체 새로 생성
		Scanner scanner = new Scanner(System.in);

		String inputString1;
		String inputString2;
		do {
			System.out.print("input Data 1>");
			inputString1 = scanner.nextLine();
			System.out.print("input Data 2>");
			inputString2 = scanner.nextLine();

			System.out.println("result1 :" + inputString1);
			System.out.println("result2 :" + inputString2);
			System.out.println("result3 :" + inputString1 + inputString2);
		}
		//대소문자 구분 x
		while (!inputString1.equals("q"));
		//대소문자 구분 o
//		while (!inputString1.equalsIgnoreCase("q"));
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
