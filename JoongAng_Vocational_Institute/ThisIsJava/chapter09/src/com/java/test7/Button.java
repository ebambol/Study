package com.java.test7;

public class Button {
	//�ʵ�
	OnClickListener listener;	//�������̽�Ÿ�� �ʵ弱��
	
	//������
	
	//�޼ҵ�
	void setOnClickListener(OnClickListener listener) {	//�Ű������� ������
		this.listener = listener;	//�������̽� ������ü ����
	}
	
	void touch () {	//���� ��ü onClick()�޼ҵ� ȣ��
		listener.onClick();
	}
	
	interface OnClickListener {
		/*public abstract*/ void onClick();		//��ø �������̽�
	}
}
