package com.java.junit;

public class Num {
	//필드
	private int value;

	//생성자
	public Num (int value) {
		this.value = value;
	}

	//메소드
	//더하기 (누적하기)
	public int add(int rhs) {
		return this.value += rhs;
	}

	//빼기
	public int subtract (int rhs) {
		return this.value -= rhs;
	}

	//곱하기
	public int multiply (int rhs) {
		return this.value *= rhs;
	}

	//나누기
	public int divide (int rhs) {
		return this.value /= rhs;
	}

	//필드값 일기
	public int getValue() {
		return this.value;
	}
}