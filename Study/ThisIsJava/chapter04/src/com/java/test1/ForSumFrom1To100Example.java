package com.java.test1;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		for(i=0; i<=100; i++) {
			sum += i;
		}
		//(i-1)�� 0~100 �ݺ��� ī���� ���� �� i=101���� -1
		System.out.println("1~"+(i-1) + "��: " + sum);
	}

}
