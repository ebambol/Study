package com.java.test1;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCircle() ½ÇÇà");
		//Math.PI => public static final double PI
		return Math.PI * r * r;
	}
}
