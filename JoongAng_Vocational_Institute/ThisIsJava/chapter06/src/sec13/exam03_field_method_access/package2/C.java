package sec13.exam03_field_method_access.package2;	//�ٸ� ��Ű��

import sec13.exam03_field_method_access.package1.*;

public class C {
	A a = new A();
	
	public C() {
		a.field1 = 1;	//(o)	//public	��ü ����
//		a.field2 = 1;	//(x)	//default	������Ű���ȿ����� ��밡��
//		a.field3 = 1;	//(x)	//private	���� Ŭ���� �ȿ����� ��밡��
		
		a.method1();	//(o)	//public
//		a.method2();	//(x)	//default
//		a.method3();	//(x)	//private
	}
}
