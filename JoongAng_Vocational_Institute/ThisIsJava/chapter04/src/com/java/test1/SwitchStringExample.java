package com.java.test1;

public class SwitchStringExample {

	public static void main(String[] args) {
		String postion = "����";
		System.out.println(postion);

		switch (postion) {
		case "����" :
			System.out.println("700����");
			break;
		case "����" :
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
		}
	}

}
