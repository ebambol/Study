package com.java.test1;

public class InputDataCheckNaNExample2 {
	public static void main (String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		System.out.println(val);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("val값이 NaN 처리 불가");
			System.out.println("연산이 가능하도록 val 값을 0.0으로 저장합니다.");
			val =0.0;
		}
		
		currentBalance+=val;
		System.out.println(currentBalance);
	}
}
