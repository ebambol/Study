package com.java.test7;

public class Button {
	//필드
	OnClickListener listener;	//인터페이스타입 필드선언
	
	//생성자
	
	//메소드
	void setOnClickListener(OnClickListener listener) {	//매개변수의 다형성
		this.listener = listener;	//인터페이스 구현객체 대입
	}
	
	void touch () {	//구현 객체 onClick()메소드 호출
		listener.onClick();
	}
	
	interface OnClickListener {
		/*public abstract*/ void onClick();		//중첩 인터페이스
	}
}
