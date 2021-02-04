package com.java.test4;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();	//재정의된 메소드 호출
		
		animal = new Cat();
		animal.sound();	//재정의된 메소드 호출
		System.out.println("----");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	//static 작성 안했을때 
	//public void animalSounds(Animal animal) {
	//Cannot make a static reference to the non-static method animalSound(Animal) from the type AnimalExample
	public static void animalSound (Animal animal) {	
		animal.sound();
	}
}
