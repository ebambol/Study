package sec13.exam03_field_method_access.package1;	//������Ű��

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;	//(o)	//public	��ü������
		a.field2 = 1;	//(o)	//default	������Ű�� ��밡��
//		a.field3 = 1;	//(x)	//private	Ŭ������ �޶� �ȵ�
		
		a.method1();	//(o)	//public
		a.method2();	//(o)	//default
//		a.method3();	//(x)	//private
	}
}
