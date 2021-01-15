package com.java.test1;

public class StringEqualsExample {
	public static void main (String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");	//새로운 객체 추가
		
		System.out.println(strVar1 == strVar2);	//같은 주소값
		System.out.println(strVar1 == strVar3);	//new String으로 다른 주소값 
		System.out.println();
		System.out.println(strVar1.equals(strVar2));	//문자열 비교 true
		System.out.println(strVar1.equals(strVar3));	//문자열 비교 true
		// String 객체가 가진 문자열이 동일한지 비교할 때, equals() 메소드를 사용해야 함.
	}
}
//== 연산자는 비교하고자 하는 대상의 주소값을 비교
//equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교
/* 실행문 
true
false

true
true
*/