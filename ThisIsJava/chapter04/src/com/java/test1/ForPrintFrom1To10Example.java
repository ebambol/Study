package com.java.test1;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
		//for(int i=0; i<=10; i++) {		//1���� 10����
		//for(int i=2; i<=10; i+=2) {		//1���� 10���� ¦��
//		for(int i=10; i>0; i--) {		//10���� 1�� ī���ʹٿ�
		for(int i=-10; i<=10; i++) {		//1���� 10����
			if(i==10) {
			System.out.print(i);
			}
			System.out.print(i + ", ");
			//if(i%2 == 0) {
			//System.out.println(i + "¦��");
		}
	}
}


