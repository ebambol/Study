package com.java.test1;

public class BitShiftExample2 {
	public static void main(String[] args) {
		System.out.println("1 => = " + Integer.toBinaryString(1));
		System.out.println("1 << 3 = " + (1<<3));
		System.out.println("1 << 3 => " + Integer.toBinaryString(1<<3));
		System.out.println("1 << 2 => " + Integer.toBinaryString(1<<2));
		System.out.println("-8 => " + Integer.toBinaryString(-8));
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >> 3 = " + Integer.toBinaryString(-8>>3));
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		System.out.println("-8 >>> 3 = " + Integer.toBinaryString(-8>>>3));
	}
}
