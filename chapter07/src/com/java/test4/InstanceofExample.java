package com.java.test4;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();	//�ڵ�����ȯ
		method1(parentA);	//method1 - Child�� ��ȯ ����
		method2(parentA);	//method2 - Child�� ��ȯ ����
		
		Parent parentB = new Parent();
		method1(parentB);	//method1 - Child�� ��ȯ���� ����
		method2(parentB);	//���ܹ߻� : java.lang.ClassCastException: com.java.test4.Parent cannot be cast to com.java.test4.Child
	}

}
