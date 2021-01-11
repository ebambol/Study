package com.java.test1;

public class SwitchStringExample {

	public static void main(String[] args) {
		String postion = "과장";
		System.out.println(postion);

		switch (postion) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}

}
