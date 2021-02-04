package com.java.test2;
/*
class와 main 사이에 클래스를 정의하면 , 객체 생성할때 클래스 없다고 징징거림
No enclosing instance of type PromotionExample is accessible.
Must qualify the allocation with an enclosing instance of type PromotionExample
(e.g. x.new A() where x is an instance of PromotionExample).
*/

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();	 
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;	//자동형변환 (작은타입 -> 큰타입)
		A a2 = c;	//자동형변환 (자식클래스 -> 조상클래스)
		A a3 = d;	//자동형변환(손자 -> 조부모)
		A a4 = e;	//자동형변환(손자 -> 조부모)
		
		B b1 = d;	//자동형변환(자식 -> 부모)
		C c1 = e;	//자동형변환
		
//		B b3 = e;	//Type mismatch: cannot convert from E to B
//		C c2 = d;	//Type mismatch: cannot convert from D to C
	}
}
