package com.java.test4;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();	//자동형변환
		method1(parentA);	//method1 - Child로 변환 성공
		method2(parentA);	//method2 - Child로 변환 성공
		
		Parent parentB = new Parent();
		method1(parentB);	//method1 - Child로 변환되지 않음
		method2(parentB);	//예외발생 : java.lang.ClassCastException: com.java.test4.Parent cannot be cast to com.java.test4.Child
	}

}
