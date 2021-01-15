package com.java.test1;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A'+1;
		char c2 = 'A';
//		char c3 = c2+1; // (char+int) mismatch
		int c4 = c2+1;	
		System.out.println(c1);
		System.out.println(c2);
		System.out.println((char)c4);
	}

}
