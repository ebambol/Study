package com.java.test4;

public class Outter {
	//Outter 인스턴스 필드
	String field = "Outter-field";
	//Outter 인스턴스 메소드
	void method() {
		System.out.println("Outter-method()");
	}
	
	//Nested 중첩클래스
	class Nested {
		//Nested 인스턴스 필드
		String field = "Nested-field";
		//Nested 인스턴스 메소드
		void method() {
			System.out.println("Nested-method()");
		}
		void print() {
			//중첩 클래스(Nested)의 객체 참조
			System.out.println(this.field);
			this.method();

			//외부클래스 (Outter)의 객체 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
