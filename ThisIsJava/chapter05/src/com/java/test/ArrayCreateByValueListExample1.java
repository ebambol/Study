package com.java.test;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
//			System.out.println("scores["+i+"] : " + scores[i]);
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("���: " + avg);
	}

}
