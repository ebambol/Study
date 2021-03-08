package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;	(x)
//		a.field3 = 1;	(x)
		
		a.method1();
//		a.method2();	(x)
//		a.method3();	(x)
	}
}
