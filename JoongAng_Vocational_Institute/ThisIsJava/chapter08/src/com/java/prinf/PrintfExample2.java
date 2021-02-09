package com.java.prinf;


public class PrintfExample2 {

	public static void main(String[] args) {
		int age = 77;
		System.out.printf("정수 출력:%d%n", 1);
		System.out.printf("정수 출력:%d%n", 10);
		System.out.printf("정수 출력:%d%n", 100);
		System.out.printf("정수 출력:%d%n", 1000);

		System.out.printf("정수 출력:%5d %n", 1);
		System.out.printf("정수 출력:%5d %n", 10);
		System.out.printf("정수 출력:%5d %n", 100);
		System.out.printf("정수 출력:%5d %n", 1000);

		//오른쪽정렬
		System.out.printf("정수 출력:%5d %5d %n", 1,2);
		System.out.printf("정수 출력:%5d %5d %n", 10,20);
		System.out.printf("정수 출력:%5d %5d %n", 100,200);
		System.out.printf("정수 출력:%5d %5d %n", 1000,2000);

		//왼쪽정렬(-)
		System.out.printf("정수 출력:%-5d %-5d %n", 1,2);
		System.out.printf("정수 출력:%-5d %-5d %n", 10,20);
		System.out.printf("정수 출력:%-5d %-5d %n", 100,200);
		System.out.printf("정수 출력:%-5d %-5d %n", 1000,2000);

		//0으로 채우기
		System.out.printf("정수 출력:%05d %05d %n", 1,2);
		System.out.printf("정수 출력:%05d %05d %n", 10,20);
		System.out.printf("정수 출력:%05d %05d %n", 100,200);
		System.out.printf("정수 출력:%05d %05d %n", 1000,2000);
	}

}