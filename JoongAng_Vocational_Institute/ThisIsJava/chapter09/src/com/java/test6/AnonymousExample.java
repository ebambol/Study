package com.java.test6;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		//�͸� ��ü �ʵ� ���
		annoy.field.turnOn();
		annoy.field.turnOff();
		//�͸� ��ü ���� ���� ���
		annoy.method1();
		//�͸� ��ü �Ű��� ���
		annoy.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV�� �մϴ�.");
					}

					@Override
					public void turnOff() {
						System.out.println("SmartTv�� ���ϴ�.");
					}
				}
				);
	}
}
