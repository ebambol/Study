//2020-12-21 �̰��� �ڹٴ� p88 ������
package com.java.test1;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);	//()��� �������� but �������� ���ؼ�
		boolean result2 = (num1 != num2);	//num1�� num2�� �ٸ���
		boolean result3 = (num1 <= num2);	//num1�� num2���� �۰ų� ����
		System.out.println(result1);	//result1 = true
		System.out.println(result2);	//result2 = false
		System.out.println(result3);	//result3 = true

		char char1 = 'A';	//A = �����ڵ� 65
		char char2 = 'B';	//B = �����ڵ� 66
		boolean result4 = (char1 < char2);	//65 < 66
		System.out.println(result4);	//result4 = true
		
		char char3 = 'a';	//a = �����ڵ� 96
		char char4 = 'b';	//b = �����ڵ� 97
		boolean result5 = (char3 > char4);	//96 > 97
		System.out.println(result5);	//result5 = false
	}
}
