package com.java.prinf;

public class PrintfExample4 {

	public static void main(String[] args) {
		String p = "Java";
		String p2 = "JAVA";
		int age = 77;

		//s 소문자 / S 대문자
		System.out.printf("[%10s] %n", p);
		System.out.printf("[%-10s] %n", p);
		System.out.printf("[%-10S] %n", p);		//소문자 -> 대문자 (o)
		System.out.printf("[%-10s] %n", p2);	//대문자 -> 소문자 (x)
		System.out.printf("[%-10.2s] %n", p);	//2자만 출력
		System.out.println();

		System.out.printf("정수 출력:%f%n", 123.2);
		System.out.printf("정수 출력:%f%n", 1.23);
		System.out.printf("정수 출력:%f%n", 1.234);
		System.out.printf("정수 출력:%f%n", 1.235);
		System.out.println();

		System.out.printf("정수 출력:[%7.2f]%n", 123.2);
		System.out.printf("정수 출력:[%7.2f]%n", 1.23);
		System.out.printf("정수 출력:[%7.2f]%n", 1.234);
		System.out.printf("정수 출력:[%7.2f]%n", 1.235);
		System.out.println();

		System.out.printf("정수 출력:%7.2f%n", 123.2);
		System.out.printf("정수 출력:%07.2f%n", 1.23);
		System.out.printf("정수 출력:%-7.2f%n", 1.234);
		System.out.printf("정수 출력:%7.2f%n", 1.235);
		System.out.println();
	}

}
