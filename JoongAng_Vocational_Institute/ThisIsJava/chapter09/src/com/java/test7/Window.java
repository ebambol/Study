package com.java.test7;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();

	//필드의 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};

	Window() {	//생성자
		button1.setOnClickListener(listener);	//매개값으로 필드 대입
		button2.setOnClickListener(new Button.OnClickListener() {	
			//매개값으로 익명 구현 객체 대입
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
