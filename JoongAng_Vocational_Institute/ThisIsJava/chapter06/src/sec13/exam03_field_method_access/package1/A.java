package sec13.exam03_field_method_access.package1;

public class A {
	//�ʵ�
	public int field1;	//public 	��ü ����
	int field2;			//default 	������Ű�� ��밡��
	private int field3;	//private	���� Ŭ���������� ��밡��
	
	//������
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//�޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3() {}
}
