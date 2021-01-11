package com.java.test;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		System.out.println(scores.length);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]" + scores[i]);
		}
	}

}
