package com.java.test4;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());	//com.java.test4.Car
		System.out.println(clazz1.getSimpleName());	//Car	클래스 이름만
		System.out.println(clazz1.getPackage().getName());	//com.java.test4	패키지명만
		System.out.println();

		try {
			Class clazz2 = Class.forName("com.java.test4.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}