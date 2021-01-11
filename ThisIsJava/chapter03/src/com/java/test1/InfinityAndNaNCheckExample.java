package com.java.test1;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/*
		 * 5 / 0, 5 % 0 => 컴파일 O, 실행시 예외발생(ArithmeticException)
		 * 
		 * 5 / 0.0, 5 / 0.0f => Infinity(무한대), 예외발생X
		 * 5 % 0.0, 5 % 0.0f => NaN(Not a Number), 예외발생X
		 * Infinity 확인 메소드 : Double.isInfinite()
		 * NaN 확인 메소드 : Double.isNaN()
		 * 
		 * NaN + 2 => NaN
		 * Infinity + 2 => Infinity
		 */
		int x = 5;
		double y = 0.0;
		
		double z = x / y;	//Infinity
//		double z = x % y;	//NaN
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2);
		
	}

}
