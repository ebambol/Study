package com.java.test2;

public class A {
	//�ν��Ͻ� �ʵ�
	B field1 = new B();	//(o)
	C field2 = new C();	//(o)
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();	//(o)
		C var2 = new C();	//(o)
	}

	//���� �ʵ� �ʱ�ȭ
//	static B field3 = new B();	//No enclosing instance of type A is accessible. 
								//Must qualify the allocation with an enclosing instance of type A (e.g. x.new A() where x is an instance of A).
	static C field4 = new C();	//(o)
	
	//���� �޼ҵ�
	static void method2() {
//		B var1 = new B();	//No enclosing instance of type A is accessible. 
							//Must qualify the allocation with an enclosing instance of type A (e.g. x.new A() where x is an instance of A).
		C var2 = new C();	//(o)
	}
	//�ν��Ͻ� ��� Ŭ����
	class B{ }
	
	//���� ��� Ŭ����
	static class C { }
}
