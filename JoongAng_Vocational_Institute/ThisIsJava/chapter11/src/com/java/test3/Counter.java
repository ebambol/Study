package com.java.test3;

public class Counter {
	//�ʵ�
	private int no;

	//������
	public Counter(int no) {
		this.no = no;
	}

	//�޼ҵ�
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"�� ��ü�� finalize()�� �����");
	}

}
