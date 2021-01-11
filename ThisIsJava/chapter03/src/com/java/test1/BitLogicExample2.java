package com.java.test1;

public class BitLogicExample2 {
	public static void main(String[] agrs) {
		System.out.println("45 = " + Integer.toBinaryString(45));	//45 = 101101
		System.out.println("25 = " + Integer.toBinaryString(25));	//25 = 11001
		System.out.println("45 & 25 = " + (45&25));
		System.out.println("45 | 25 = " + (45|25));
		System.out.println("45 ^ 25 = " + (45^25));
		System.out.println("~45 = " + (~45));
		System.out.println("~45 = " + Integer.toBinaryString(~45));
//		~45 = 11111111 11111111 11111111 11010010
		System.out.println("~25 = " + Integer.toBinaryString(~25));
		//~25 = 11111111 11111111 11111111 11100110
	}
	
}

/*
45 = 101101
45 | 25 = 61
45 ^ 25 = 52
~45 = -46
*/