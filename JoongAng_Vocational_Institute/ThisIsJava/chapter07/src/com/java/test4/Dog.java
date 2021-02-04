package com.java.test4;

public class Dog extends Animal{
	//생성자
	public Dog() {
		this.kind = "포유류";
	}

//	오버라이딩 하지 않으면 뜨는 오류	The type Dog must implement the inherited abstract method Animal.sound()
	@Override
	public void sound() {
		System.out.println("멍멍");	//추상메소드 재정의
	}
}
