package com.java.test2;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	//부모클래스 타입으로 자동 형변환
		parent.method1();
		parent.method2();
//		parent.method3();	//부모클래스에 method3()이 없음
		//The method method3() is undefined for the type Parent
		
		Child child2 = (Child)parent;	//강제형변환(캐스팅)
		child2.method3();
	}

}
