package com.java.test1;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog, "dog");
		
		Cat cat = new Cat();
		changeDog(cat, "cat");	//Exception in thread "main" java.lang.ClassCastException: com.java.test1.Cat cannot be cast to com.java.test1.Dog
	}
	
	//main�� static�̶� �ٷ� ��ü ����� ��� �޼ҵ� ����
	public static void changeDog(Animal animal, String obj) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;	//ClassCastException �߻� ����
			System.out.println(obj+"��������ȯ ����");	
		} else {
			System.out.println(obj+"��������ȯ ����");
		}
	}
}	//end of ClassCastExceptionExample
/*
	The public type Animal must be defined in its own file
	AnimalŬ������ public���� ���� �� �� ����
	public ������ �����̸��� Ŭ�����̸��� ���ƾ߸� ����
*/
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }
