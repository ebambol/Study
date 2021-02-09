package com.java.prinf;

public class PrintfExample {

	public static void main(String[] args) {
		int age = 77;
		String addr = "경기도";
		float f = 1.2345f;
		double d = 3.14;
		char c = 'a';
		boolean b = true;
		System.out.printf("%d년도 내 나이는 %d입니다.%n", 2021,age);
		System.out.printf("저는 %s에 살고 있어요%n", addr);
		System.out.printf("소수점 결과는 %f , %f %n", f,d);
		System.out.printf("10을 8진수로 표현  = %o %n", age);
		System.out.printf("10을 8진수로 표현  = %X, %x %n", age,age);
		System.out.printf("알파벳의 시작은 %c 부터%n", c);
		System.out.printf("참인가 거짓인가 정답은: %b %B%n",b,b);
		System.out.printf("%e%n",123.456);
		System.out.printf("%.2e%n",123.456);
	}

}
