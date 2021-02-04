package com.java.test2;
/*
class�� main ���̿� Ŭ������ �����ϸ� , ��ü �����Ҷ� Ŭ���� ���ٰ� ¡¡�Ÿ�
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
		
		A a1 = b;	//�ڵ�����ȯ (����Ÿ�� -> ūŸ��)
		A a2 = c;	//�ڵ�����ȯ (�ڽ�Ŭ���� -> ����Ŭ����)
		A a3 = d;	//�ڵ�����ȯ(���� -> ���θ�)
		A a4 = e;	//�ڵ�����ȯ(���� -> ���θ�)
		
		B b1 = d;	//�ڵ�����ȯ(�ڽ� -> �θ�)
		C c1 = e;	//�ڵ�����ȯ
		
//		B b3 = e;	//Type mismatch: cannot convert from E to B
//		C c2 = d;	//Type mismatch: cannot convert from D to C
	}
}
