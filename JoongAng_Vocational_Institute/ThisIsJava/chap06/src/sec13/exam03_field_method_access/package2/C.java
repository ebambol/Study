package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	//public	
		
		//��Ű���� �޶� ��� �Ұ�
//		a.field2 = 1;	(x)//default
		
		//��Ű��,Ŭ������ �޶� ���Ұ�
//		a.field3 = 1;	(x)//private
		
		a.method1();	//public

		//��Ű���� �޶� ��� �Ұ�
//		a.method2();	(x)//default

		//��Ű��,Ŭ������ �޶� ���Ұ�
//		a.method3();	(x)//private
	}
}
