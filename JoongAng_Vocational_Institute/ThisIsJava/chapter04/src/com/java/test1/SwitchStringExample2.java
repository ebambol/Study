package com.java.test1;

public class SwitchStringExample2 {

	public static void main(String[] args) {
		double postion = 1.5;
		System.out.println(postion);

		switch ((int)postion) {
		case 1 :
			System.out.println("700만원");
			break;
		case 2 :
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}

}
