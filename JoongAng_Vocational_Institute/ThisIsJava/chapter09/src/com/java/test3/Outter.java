package com.java.test3;

/*
 * final 키워드가 있다면 로컬 클래스의 메소드 내부에 지역변수로 복사, 
 * final 키워드가 없다면 로컬 클래스의 필드로 복사
 */

public class Outter {
	//자바 7 이전 ->로컬클래스내 사용은 final선언된 매개변수, 로컬변수만
	public void method1(final int arg) { //메소드1 매개변수 final int arg
		final int localVariable = 1;
//		arg = 100;				//The final local variable arg cannot be assigned. It must be blank and not using a compound assignment
								//fianl 지역 변수 arg를 할당할 수 없다.
//		localVariable = 100;	//The final local variable localVariable cannot be assigned. It must be blank and not using a compound assignment

		class Inner { //Inner로컬클래스
			public void method() {
				//int arg가 복사됨
				//int localVariable = 1; 복사됨
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후 ->
	public void method2 (/*final 생략*/int arg) {	//메소드2 매개변수 (final)int arg
		int localVariable = 1;
//		arg = 100;	//(x)
//		localVariable = 100;	//(x)
		/*
	  Multiple markers at this line
	- The value of the local variable result is not used
	지역 변수 결과값이 사용되지 않았다.
	- Local variable arg defined in an enclosing scope must be final or effectively final
	 로컬 변수 arg는 final 혹은 effectively final의 범위로 정의 되어 있다.
	 effectively final - final이 붙지 않았지만, 값이 변하지 않는 변수
	 */
		class Inner { //Inner로컬클래스
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
