package com.java.test1;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1F; x<=1; x+=0.1f) {
			System.out.print(x + ", ");
		}
		System.out.println();
		for(int i=0; i<=10; i++) {
			if(i==10) {
				System.out.print(i);
			}else {
				System.out.print(i + ", ");
			}
		}
	}

}
