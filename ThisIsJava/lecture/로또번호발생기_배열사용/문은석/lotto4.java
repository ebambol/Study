package com.java.lotto;

public class lotto4 {

	public static void main(String[] args) {
		int [] lotto = new int [6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45  +1) ;
		
		
		for ( int j = 0; j < i; j++) {
			while (lotto[i]==lotto[j]) {
				lotto[j] = (int)(Math.random() * 45  +1) ;
			}
		}
		
		
		}
		for (int i = 0; i < lotto.length; i++) {
	
			System.out.println(lotto[i]);
	}

}

}