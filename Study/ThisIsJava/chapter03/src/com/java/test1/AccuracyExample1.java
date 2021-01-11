package com.java.test1;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;	//조각단위
		int number = 7;	//7조각
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면,");
		System.out.println(result + "조각이 남는다");
	}

}
