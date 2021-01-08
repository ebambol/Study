package com.java.test1;

public class OverflowExample2 {
	public static void main (String[] args) {
		long x = 1000000;
		long y = 1000000;
		long result1 = x*y;
		long result2 =(long)x*y;
		System.out.println(result1);
		System.out.println(result2);
	}
}
