package com.java.test1

public class Lotto {
	public static void main(String[] args) {
	
		/*
		//1. 배열
		int[] num = {0, 0, 0, 0, 0, 0};
		for(int i = 0; i < 6; i++) {
			num[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				while(num[i]==num[j]) {	num[i] = (int)(Math.random() * 45) + 1;	}
			}
			System.out.println("로또 번호 : " + num[i]);
		}
		*/
		
		
		//2.
		int num1, num2, num3, num4, num5, num6;
		do {
			//난수 생성
			num1 = (int)(Math.random() * 45) + 1;
			num2 = (int)(Math.random() * 45) + 1;
			num3 = (int)(Math.random() * 45) + 1;
			num4 = (int)(Math.random() * 45) + 1;
			num5 = (int)(Math.random() * 45) + 1;
			num6 = (int)(Math.random() * 45) + 1;			
		} while(num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 ||	//num1과 비교 
				num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6 ||	//num2와 비교
				num3 == num4 || num3 == num5 || num3 == num6 ||	//num3과 비교
				num4 == num5 || num4 == num6 || //num4와 비교
				num5 == num6);	//나머지 비교
		//출력
		System.out.println("로또 번호 : " + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "," + num6);	
	}	
		
		
}

