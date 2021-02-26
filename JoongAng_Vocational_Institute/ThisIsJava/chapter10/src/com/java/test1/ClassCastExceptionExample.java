package com.java.test1;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog, "dog");
		
		Cat cat = new Cat();
		changeDog(cat, "cat");	//Exception in thread "main" java.lang.ClassCastException: com.java.test1.Cat cannot be cast to com.java.test1.Dog
	}
	
	//main은 static이라 바로 객체 만들수 없어서 메소드 선언
	public static void changeDog(Animal animal, String obj) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;	//ClassCastException 발생 가능
			System.out.println(obj+"강제형변환 성공");	
		} else {
			System.out.println(obj+"강제형변환 실패");
		}
	}
}	//end of ClassCastExceptionExample
/*
	The public type Animal must be defined in its own file
	Animal클래스는 public으로 선언 할 수 없다
	public 선언은 파일이름과 클래스이름과 같아야만 가능
*/
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }
