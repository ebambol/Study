package com.java.test5;

//public class CallListener implements OnClickListener{		//OnClickListener cannot be resolved to a type
public class CallListener implements Button.OnClickListener{	//Button(Ŭ����).OnClickListener(��ø�޼ҵ�)
	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
}