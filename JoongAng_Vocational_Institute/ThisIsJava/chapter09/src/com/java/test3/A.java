package com.java.test3;

public class A {
	//�ν��Ͻ� �ʵ�, �޼ҵ�
	int field1;
	void method1() { }

	//���� �ʵ�, �޼ҵ�
	static int field2;
	static void method2() { }

	//�ν��Ͻ� ���Ŭ����B �޼ҵ�
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	//���� ���Ŭ����C �޼ҵ�
	static class C {
		void method() {
//			field1 = 10;	//Cannot make a static reference to the non-static field field1
							//static ���۷������� static�� �ƴ� field1�� ����� ����
//			method1();		//Cannot make a static reference to the non-static method method1() from the type A
							//static ���۷������� static�� �ƴ� AŸ���� �޼ҵ� method1()�� ����� ����
			
			field2 = 10;
			method2();
		}
	}
}
							//- ������Ƽ��Ÿ�� : short, int, long, char, boolean, float, double / ���� ������ �����Ͽ� ����ϴ� ���� 
							//- ���۷���Ÿ�� : Ŭ����, �������̽�, �迭, ������ / ���� ������ ���������� ������ ������(�޸𸮻�)�� ������������ ��(������Ƽ��Ÿ�� ����� �̷����)�� ���� ��������� �ʴ� ���� Ư¡�̴�.
