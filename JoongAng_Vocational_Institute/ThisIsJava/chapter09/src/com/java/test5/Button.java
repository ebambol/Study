package com.java.test5;

public class Button {
	//�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	//�Ű� ������ ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	//listener�ʵ忡 ������ü listener ����
	}
	
	//���� ��ü�� onClick() �޼ҵ� ȣ��
	void touch() {
		listener.onClick();	//listener������ü�� onClick�޼ҵ� ����
	}
	//��ø �������̽�
	interface OnClickListener{
		/*public abstract*/ void onClick();	//�߻�޼ҵ�
	}
}
