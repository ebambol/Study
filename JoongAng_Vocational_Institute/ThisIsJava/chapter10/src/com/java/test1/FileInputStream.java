package com.java.test1;

public class FileInputStream implements AutoCloseable{
	//�ʵ�
	private String file;
	
	//������
	public FileInputStream(String file) {
		this.file = file;
	}
	//�޼ҵ�
	public void read() {
		System.out.println(file+"�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {	//AutoCloseable�� �߻�޼ҵ� close() ����
		System.out.println(file+"�� �ݽ��ϴ�.");
	}
}
