package com.java.test1;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		char c1 = 'A';
		int val2 = Integer.valueOf(c1);
		System.out.println(val2);
		double currentBalance = 1000.0;
		
		currentBalance += val;
		//currentBalance = currentBalance + val;
		
		System.out.println(currentBalance);
	}

}
