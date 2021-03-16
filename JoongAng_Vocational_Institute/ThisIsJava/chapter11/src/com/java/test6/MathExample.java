package com.java.test6;

public class MathExample {

	public static void main(String[] args) {
		//절대값 Math.abs()
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1= " + v1);	//v1= 5
		System.out.println("v2= " + v2);	//v2 = 3.14
		
		//올림값 Math.ceil
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3= " + v3);	//v3= 6.0
		System.out.println("v4= " + v4);	//v4= -5.0
		
		//버림값 Math.floor
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5= " + v5);	//v5= 5.0
		System.out.println("v6= " + v6);	//v6= -6.0
		
		//최대값 Math.max
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7= " + v7);	//v7= 9
		System.out.println("v8= " + v8);	//v8= 5.3
		
		//최소값 Math.min
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9= " + v9);	//v9= 5
		System.out.println("v10= " + v10);	//v10= 2.5
		
		//랜덤 Math.random
		double v11 = Math.random();
		System.out.println("v11= " + v11);	//v11= 0.9701251501654101
		
		//가까운 정수의 실수값 Math.rint
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12= " + v12);	//v12= 5.0
		System.out.println("v13= " + v13);	//v13= 6.0
		
		//반올림	Math.round
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14= " + v14);	//v14= 5
		System.out.println("v15= " + v15);	//v15= 6
		
		double value = 12.3456;
		double temp1 = value * 100;	//12.34
		long temp2 = Math.round(temp1);	//1235
		double v16 = temp2/100.0;	//12.35
		System.out.println("v16= " + v16);	//12.35
	}
}