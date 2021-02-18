package com.java.test1;

public class A {	//외부클래스
	//생성자
	A() { System.out.println("A 객체가 생성됨"); }

	//인스턴스 멤버 클래스
	class B {
		B() { System.out.println("A.B 객체가 생성됨"); }
		int field1;	//(o)
		void method1() { }	//(o)
//		static int field2;	//(x)
//		static void method2() { }	//(x)	
	}
	
	//정적 멤버 클래스
	static class C {
		C() { System.out.println("A.C객체가 생성됨"); }
		int field1;	//(o)
		void method1() { }	//(o)
		static int field2;	//(o)
		static void method2() { }	//(o)
	}
	
	void method() {
		//로컬 클래스
		class D {
			D() { System.out.println("A.D객체가 생성됨"); }
			int field1;	//(o)
			void method1() { }	//(o)
//			static int field2;	//(x)
//			static void method2() { }	//(x)
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
