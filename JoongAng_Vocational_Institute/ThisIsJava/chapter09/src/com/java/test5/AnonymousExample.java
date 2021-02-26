package com.java.test5;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명 객체 필드 사용
		anony.field.wake();	//6시에 일어납니다.
							//출근합니다.
		//익명 객체 로컬 변수 사용
		anony.method1();	//7시에 일어납니다.
							//산책합니다.
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
	}

}
