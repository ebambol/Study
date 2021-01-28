package sec13.exam03_field_method_access.package1;	//동일패키지

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;	//(o)	//public	전체공개됨
		a.field2 = 1;	//(o)	//default	동일패키지 사용가능
//		a.field3 = 1;	//(x)	//private	클래스가 달라서 안됨
		
		a.method1();	//(o)	//public
		a.method2();	//(o)	//default
//		a.method3();	//(x)	//private
	}
}
