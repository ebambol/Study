package com.java.test1;

public class A {	//�ܺ�Ŭ����
	//������
	A() { System.out.println("A ��ü�� ������"); }

	//�ν��Ͻ� ��� Ŭ����
	class B {
		B() { System.out.println("A.B ��ü�� ������"); }
		int field1;	//(o)
		void method1() { }	//(o)
//		static int field2;	//(x)
//		static void method2() { }	//(x)	
	}
	
	//���� ��� Ŭ����
	static class C {
		C() { System.out.println("A.C��ü�� ������"); }
		int field1;	//(o)
		void method1() { }	//(o)
		static int field2;	//(o)
		static void method2() { }	//(o)
	}
	
	void method() {
		//���� Ŭ����
		class D {
			D() { System.out.println("A.D��ü�� ������"); }
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
