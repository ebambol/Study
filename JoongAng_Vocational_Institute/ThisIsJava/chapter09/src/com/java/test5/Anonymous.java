package com.java.test5;

public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	Person field = new Person() {
		void work() {	//�ڽ�(�͸�Ŭ����)���� �߰��Ǵ� �޼ҵ�
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};	//�͸�ü �����̶� �����ݷ��ۼ�
	
	void method1() {
		//���� ���������� �͸�ü ����
		Person localVar = new Person() {	//�͸�Ŭ���� ����
			void walk() {	//�͸�Ŭ�������� �߰��� �޼ҵ�
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		//���� ���� ���
		localVar.wake();
	}	//End of method1()
	
	void method2(Person person) {
		person.wake();
	}
}
