package com.java.test1;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/*
		 * 5 / 0, 5 % 0 => ������ O, ����� ���ܹ߻�(ArithmeticException)
		 * 
		 * 5 / 0.0, 5 / 0.0f => Infinity(���Ѵ�), ���ܹ߻�X
		 * 5 % 0.0, 5 % 0.0f => NaN(Not a Number), ���ܹ߻�X
		 * Infinity Ȯ�� �޼ҵ� : Double.isInfinite()
		 * NaN Ȯ�� �޼ҵ� : Double.isNaN()
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
