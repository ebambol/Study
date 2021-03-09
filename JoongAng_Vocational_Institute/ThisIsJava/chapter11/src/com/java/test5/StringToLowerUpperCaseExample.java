package com.java.test5;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println("대소문자 구분 : " + str1.equals(str2));	//false(대소문자 구분)
		
		String lowerStr1 = str1.toLowerCase();	//str1객체 소문자 변환
		String lowerStr2 = str2.toLowerCase();	//str2객체 소문자 변환
		
		System.out.println("lowerStr1: " + lowerStr1);
		System.out.println("lowerStr2: " + lowerStr2);
		
		System.out.println("소문자 비교 : " + lowerStr1.equals(lowerStr2));	//true
		
		String UpperStr1 = str1.toUpperCase();
		String UpperStr2 = str2.toUpperCase();
		
		System.out.println("UpperStr1: " + UpperStr1);
		System.out.println("UpperStr2: " + UpperStr2);
		
		System.out.println("대소문자 구분없음: " + str1.equalsIgnoreCase(str2));	//true (대소문자 구분없음)
	}

}
