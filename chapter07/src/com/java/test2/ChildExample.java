package com.java.test2;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	//�θ�Ŭ���� Ÿ������ �ڵ� ����ȯ
		parent.method1();
		parent.method2();
//		parent.method3();	//�θ�Ŭ������ method3()�� ����
		//The method method3() is undefined for the type Parent
		
		Child child2 = (Child)parent;	//��������ȯ(ĳ����)
		child2.method3();
	}

}
