//2020-12-21 이것이 자바다 p88 이현국
package com.java.test1;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);	//()없어도 문제없음 but 가독성을 위해서
		boolean result2 = (num1 != num2);	//num1은 num2랑 다르다
		boolean result3 = (num1 <= num2);	//num1은 num2보다 작거나 같다
		System.out.println(result1);	//result1 = true
		System.out.println(result2);	//result2 = false
		System.out.println(result3);	//result3 = true

		char char1 = 'A';	//A = 유니코드 65
		char char2 = 'B';	//B = 유니코드 66
		boolean result4 = (char1 < char2);	//65 < 66
		System.out.println(result4);	//result4 = true
		
		char char3 = 'a';	//a = 유니코드 96
		char char4 = 'b';	//b = 유니코드 97
		boolean result5 = (char3 > char4);	//96 > 97
		System.out.println(result5);	//result5 = false
	}
}
