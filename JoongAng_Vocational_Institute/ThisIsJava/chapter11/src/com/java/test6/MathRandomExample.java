package com.java.test6;

public class MathRandomExample {

	public static void main(String[] args) {
		//주사위
		int num = (int)(Math.random()*6)+1;
		System.out.println("주사위 값: " + num);
		
		//로또
		num = (int)(Math.random()*45)+1;
		System.out.println("로또 값: "+num);
	}

}
