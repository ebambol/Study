package com.java.test1;

public class DenyLogicOperatorExample {
	public static void main (String[] args) {
		boolean play = true;
		System.out.println (play);

		play = !play;	//true = !true(false)
		System.out.println(play);
		
		play = !play;	//false = !false(true)
		System.out.println(play);
	}
}
