package com.java.test5;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();	//전화를 겁니다.
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();	//메시지를 보냅니다.
	}

}
