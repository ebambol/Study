package com.java.test5;

public class Anonymous {
	//필드 초기값으로 대입
	Person field = new Person() {
		void work() {	//자식(익명클래스)에서 추가되는 메소드
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};	//익명객체 선언문이라 세미콜론작성
	
	void method1() {
		//로컬 변수값으로 익명객체 대입
		Person localVar = new Person() {	//익명클래스 선언
			void walk() {	//익명클래스에서 추가된 메소드
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		//로컬 변수 사용
		localVar.wake();
	}	//End of method1()
	
	void method2(Person person) {
		person.wake();
	}
}
