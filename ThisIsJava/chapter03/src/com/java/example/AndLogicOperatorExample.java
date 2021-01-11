package com.java.example;

public class AndLogicOperatorExample {
	public static void main(String[] args) {
		boolean bv1 = false;
		boolean bv2 = true;
		boolean result;
		
		result = bv1 & bv2;	
		// Áø¸®Ç¥ (Truth Table)
		// true and true => true
		// true and false => false
		// false and true => false
		// false and false => false
		System.out.println(result);
	}
}
