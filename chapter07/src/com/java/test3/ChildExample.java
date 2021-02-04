package com.java.test3;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();	//자동형변환
		parent.field1 = "data1";
//		parent.field2 = "data2";	//field2 cannot be resolved or is not a field	(부모것만 쓸수 있음)
		parent.method1();	//Parent-method1()
		parent.method2();	//Parent-method2()
//		parent.method3();	//The method method3() is undefined for the type Parent	(부모것만 쓸수 있음)
		
		Child child = (Child)parent;	//강제형변환
		child.field2 = "data2";
		child.method3();	//Child-method3()
	}
}