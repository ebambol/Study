package com.java.test5;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();	//��ȭ�� �̴ϴ�.
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();	//�޽����� �����ϴ�.
	}

}
