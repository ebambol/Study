//2020-12-17 �̰��� �ڹٴ� p69 ������
package com.java.test1;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
//		System.out.println("x: " + x);
		int result1 = +x; // 1 * 100
		int result2 = -x; // -1 * -100
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		short s = 100;
//		short result3 = -s; //casting or short->int �ٲٱ� �ʿ�	//Type mismatch: cannot convert from int to short
		int result3 = -s;
		System.out.println("result3: " + result3);
	}
}