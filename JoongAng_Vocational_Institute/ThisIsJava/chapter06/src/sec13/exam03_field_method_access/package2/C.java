package sec13.exam03_field_method_access.package2;	//다른 패키지

import sec13.exam03_field_method_access.package1.*;

public class C {
	A a = new A();
	
	public C() {
		a.field1 = 1;	//(o)	//public	전체 공개
//		a.field2 = 1;	//(x)	//default	동일패키지안에서만 사용가능
//		a.field3 = 1;	//(x)	//private	만든 클래스 안에서만 사용가능
		
		a.method1();	//(o)	//public
//		a.method2();	//(x)	//default
//		a.method3();	//(x)	//private
	}
}
