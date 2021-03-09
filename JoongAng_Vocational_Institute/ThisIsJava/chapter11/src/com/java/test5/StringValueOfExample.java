package com.java.test5;

public class StringValueOfExample {

	public static void main(String[] args) {
		String str1 = String.valueOf(10);	//10 -> "10"
		String str2 = String.valueOf(10.5);	//10.5 -> "10.5"
		String str3 = String.valueOf(true);	//true -> "true"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
