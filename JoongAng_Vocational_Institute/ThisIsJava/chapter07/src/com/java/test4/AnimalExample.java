package com.java.test4;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();	//�����ǵ� �޼ҵ� ȣ��
		
		animal = new Cat();
		animal.sound();	//�����ǵ� �޼ҵ� ȣ��
		System.out.println("----");
		
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}

	//static �ۼ� �������� 
	//public void animalSounds(Animal animal) {
	//Cannot make a static reference to the non-static method animalSound(Animal) from the type AnimalExample
	public static void animalSound (Animal animal) {	
		animal.sound();
	}
}
