package com.java.test1;

public class OverflowExample {
	public static void main (String[] args) {
		int x = 1000000;
		int y = 1000000;
		int result1 = x*y;	//overflow�߻�
		long result2 =(long)x*y;
		System.out.println(result1);
		System.out.println(result2);
	}
}
