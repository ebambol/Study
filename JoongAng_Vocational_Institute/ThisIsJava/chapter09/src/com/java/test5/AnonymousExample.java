package com.java.test5;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();	//6�ÿ� �Ͼ�ϴ�.
							//����մϴ�.
		//�͸� ��ü ���� ���� ���
		anony.method1();	//7�ÿ� �Ͼ�ϴ�.
							//��å�մϴ�.
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			}
		);
	}

}
