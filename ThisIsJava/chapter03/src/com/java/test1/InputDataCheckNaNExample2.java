package com.java.test1;

public class InputDataCheckNaNExample2 {
	public static void main (String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		System.out.println(val);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("val���� NaN ó�� �Ұ�");
			System.out.println("������ �����ϵ��� val ���� 0.0���� �����մϴ�.");
			val =0.0;
		}
		
		currentBalance+=val;
		System.out.println(currentBalance);
	}
}
