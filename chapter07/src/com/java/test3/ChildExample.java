package com.java.test3;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();	//�ڵ�����ȯ
		parent.field1 = "data1";
//		parent.field2 = "data2";	//field2 cannot be resolved or is not a field	(�θ�͸� ���� ����)
		parent.method1();	//Parent-method1()
		parent.method2();	//Parent-method2()
//		parent.method3();	//The method method3() is undefined for the type Parent	(�θ�͸� ���� ����)
		
		Child child = (Child)parent;	//��������ȯ
		child.field2 = "data2";
		child.method3();	//Child-method3()
	}
}