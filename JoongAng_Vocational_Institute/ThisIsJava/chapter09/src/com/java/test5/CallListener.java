package com.java.test5;

//public class CallListener implements OnClickListener{		//OnClickListener cannot be resolved to a type
public class CallListener implements Button.OnClickListener{	//Button(클래스).OnClickListener(중첩메소드)
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
