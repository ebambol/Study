package sec13.exam03_field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;	//public

		//���� ��Ű�� ��밡��
		a.field2 = 1;	//default
		
		//class A�� �ٱ���, private ���Ұ�
//		a.field3 = 1;(x)//private
		
		a.method1();	//public
		
		//���� ��Ű�� ��밡��
		a.method2();	//default
		
		//class A�� �ٱ���, private ���Ұ�
//		a.method3();	(x)//private
	}
}
