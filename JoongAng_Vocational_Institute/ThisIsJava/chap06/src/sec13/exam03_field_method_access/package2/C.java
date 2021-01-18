package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	//public	
		
		//패키지가 달라 사용 불가
//		a.field2 = 1;	(x)//default
		
		//패키지,클래스가 달라 사용불가
//		a.field3 = 1;	(x)//private
		
		a.method1();	//public

		//패키지가 달라 사용 불가
//		a.method2();	(x)//default

		//패키지,클래스가 달라 사용불가
//		a.method3();	(x)//private
	}
}
