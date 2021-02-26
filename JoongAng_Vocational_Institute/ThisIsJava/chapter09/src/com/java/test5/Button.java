package com.java.test5;

public class Button {
	//인터페이스 타입 필드
	OnClickListener listener;
	
	//매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	//listener필드에 구현객체 listener 저장
	}
	
	//구현 객체의 onClick() 메소드 호출
	void touch() {
		listener.onClick();	//listener구현객체의 onClick메소드 실행
	}
	//중첩 인터페이스
	interface OnClickListener{
		/*public abstract*/ void onClick();	//추상메소드
	}
}
