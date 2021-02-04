package com.java.test4;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone();	//Cannot instantiate the type Phone
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		
		System.out.println("smartPhone.owner : " + smartphone.owner);
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}
