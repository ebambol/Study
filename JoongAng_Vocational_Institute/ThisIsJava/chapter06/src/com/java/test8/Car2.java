package com.java.test8;

public class Car2 {
	static int speed;
	static void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		speed = 60;
		run();
	}
}
