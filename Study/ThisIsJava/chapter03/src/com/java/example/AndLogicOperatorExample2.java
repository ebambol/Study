package com.java.example;

public class AndLogicOperatorExample2 {
	public static void main(String[] args) {
		boolean bv1 = true;
		boolean bv2 = true;
		boolean result;
		
		result = !(!bv1 & !bv2);
		// Áø¸®Ç¥ (Truth Table)
		// true and true => true
		// true and false => false
		// false and true => false
		// false and false => false
		System.out.println(result);
	}
}
