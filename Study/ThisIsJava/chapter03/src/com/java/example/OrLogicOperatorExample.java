package com.java.example;

public class OrLogicOperatorExample {
	public static void main(String[] args) {
		boolean bv1 = true;
		boolean bv2 = true;
		boolean result;
		
//		result = bv1 | bv2;	//true OR true
		result = !bv1 | bv2;
		// Áø¸®Ç¥ (Truth Table)
		// true or true => true
		// true or false => true
		// false or true => true
		// false or false => false
		System.out.println(result);
	}
}
