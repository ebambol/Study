package com.java.test1;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
		//for(int i=0; i<=10; i++) {		//1에서 10사이
		//for(int i=2; i<=10; i+=2) {		//1에서 10사이 짝수
//		for(int i=10; i>0; i--) {		//10에서 1로 카운터다운
		for(int i=-10; i<=10; i++) {		//1에서 10사이
			if(i==10) {
			System.out.print(i);
			}
			System.out.print(i + ", ");
			//if(i%2 == 0) {
			//System.out.println(i + "짝수");
		}
	}
}


