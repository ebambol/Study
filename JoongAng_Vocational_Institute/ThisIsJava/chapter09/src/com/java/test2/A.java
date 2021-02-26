package com.java.test2;

public class A {
	//인스턴스 필드
	B field1 = new B();	//(o)
	C field2 = new C();	//(o)
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();	//(o)
		C var2 = new C();	//(o)
	}

	//정적 필드 초기화
//	static B field3 = new B();	//No enclosing instance of type A is accessible. 
								//Must qualify the allocation with an enclosing instance of type A (e.g. x.new A() where x is an instance of A).
	static C field4 = new C();	//(o)
	
	//정적 메소드
	static void method2() {
//		B var1 = new B();	//No enclosing instance of type A is accessible. 
							//Must qualify the allocation with an enclosing instance of type A (e.g. x.new A() where x is an instance of A).
		C var2 = new C();	//(o)
	}
	//인스턴스 멤버 클래스
	class B{ }
	
	//정적 멤버 클래스
	static class C { }
}
