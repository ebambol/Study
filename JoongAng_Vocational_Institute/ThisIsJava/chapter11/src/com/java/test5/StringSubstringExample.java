package com.java.test5;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "654321-1234567";
		
		String firstNum = ssn.substring(0,6);
		//substring(int beginIndex, int endIndex-1)
		String secondNum = ssn.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
	}

}
