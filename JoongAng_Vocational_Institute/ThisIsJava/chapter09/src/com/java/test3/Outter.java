package com.java.test3;

/*
 * final Ű���尡 �ִٸ� ���� Ŭ������ �޼ҵ� ���ο� ���������� ����, 
 * final Ű���尡 ���ٸ� ���� Ŭ������ �ʵ�� ����
 */

public class Outter {
	//�ڹ� 7 ���� ->����Ŭ������ ����� final����� �Ű�����, ���ú�����
	public void method1(final int arg) { //�޼ҵ�1 �Ű����� final int arg
		final int localVariable = 1;
//		arg = 100;				//The final local variable arg cannot be assigned. It must be blank and not using a compound assignment
								//fianl ���� ���� arg�� �Ҵ��� �� ����.
//		localVariable = 100;	//The final local variable localVariable cannot be assigned. It must be blank and not using a compound assignment

		class Inner { //Inner����Ŭ����
			public void method() {
				//int arg�� �����
				//int localVariable = 1; �����
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ� 8 ���� ->
	public void method2 (/*final ����*/int arg) {	//�޼ҵ�2 �Ű����� (final)int arg
		int localVariable = 1;
//		arg = 100;	//(x)
//		localVariable = 100;	//(x)
		/*
	  Multiple markers at this line
	- The value of the local variable result is not used
	���� ���� ������� ������ �ʾҴ�.
	- Local variable arg defined in an enclosing scope must be final or effectively final
	 ���� ���� arg�� final Ȥ�� effectively final�� ������ ���� �Ǿ� �ִ�.
	 effectively final - final�� ���� �ʾ�����, ���� ������ �ʴ� ����
	 */
		class Inner { //Inner����Ŭ����
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
