package com.java.test4;

public class Car {
	//필드
	public String name;
	public int price;
	
	//생성자
	public Car() { }
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//메소드
	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}
