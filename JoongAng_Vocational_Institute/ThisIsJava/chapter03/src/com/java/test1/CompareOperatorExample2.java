//2020-12-21 �̰��� �ڹٴ� p89 ������
package com.java.test1;

public class CompareOperatorExample2 {
	public static void main (String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);	//true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);	//false	(����: true�� �ƴ�)
//		System.out.println(v4 < v5);	//true
		System.out.println ((float)v4 == v5);	//true
		System.out.println ((int)(v4*10) == (int)(v5*10));	//true

//		System.out.println ((int)(v4*10));	//1
//		System.out.println ((int)(v5*10));	//1
	}
}

/*
true
false
true
true
*/