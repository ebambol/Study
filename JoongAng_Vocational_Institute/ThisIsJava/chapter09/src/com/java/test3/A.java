package com.java.test3;

public class A {
	//인스턴스 필드, 메소드
	int field1;
	void method1() { }

	//정적 필드, 메소드
	static int field2;
	static void method2() { }

	//인스턴스 멤버클래스B 메소드
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	//정적 멤버클래스C 메소드
	static class C {
		void method() {
//			field1 = 10;	//Cannot make a static reference to the non-static field field1
							//static 레퍼런스에서 static이 아닌 field1를 만들수 없다
//			method1();		//Cannot make a static reference to the non-static method method1() from the type A
							//static 레퍼런스에서 static이 아닌 A타입의 메소드 method1()을 만들수 없다
			
			field2 = 10;
			method2();
		}
	}
}
							//- 프리미티브타입 : short, int, long, char, boolean, float, double / 값을 변수에 대입하여 사용하는 형태 
							//- 레퍼런스타입 : 클래스, 인터페이스, 배열, 열거형 / 값을 변수에 대입하지만 변수는 참조값(메모리상)을 가지고있지만 값(프리미티브타입 값들로 이루어진)을 직접 들고있지는 않는 것이 특징이다.
