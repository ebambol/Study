//2020-12-21 이것이 자바다 이현국
package com.java.test1;

public class StringConcatExample {
	public static void main (String[] args) {
		String str1 = "JDK" + 6.0;	//String + String
		String str2 = str1 + " 특징";	//String + String
		System.out.println(str2);	//JDK6.0 특징
		
		String str3 = "JDK" + 3 + 3.0;	
//String + int + int => String(문자열) 우선
		String str3_1 = "JDK" + (3 + 3.0);	//()먼저 실행 double 변환, 3+3.0 이후 JDK
		String str4 = 3 + 3.0 + "JDK";	//3 + 3.0 double 변환, 이후 문자열
		System.out.println(str3);	//JDK 33.0
		System.out.println(str3_1);	//JDK 6.0
		System.out.println(str4);	//6.0JDK
	}
}
/* 실행문
JDK6.0 특징
JDK33.0
JDK6.0
6.0JDK
*/