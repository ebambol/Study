package com.java.test1;

public class ConditionalOperationExample {
	public static void main (String[] args) {
		int score = 91;
		char grade = (score >90) ? 'A' : ((score >80) ? 'B' : 'C');
		System.out.println(score + "���� " + grade + "����Դϴ�.");
	}
}
