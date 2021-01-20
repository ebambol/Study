package sec13.exam03_field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;	//public

		//같은 패키지 사용가능
		a.field2 = 1;	//default
		
		//class A의 바깥쪽, private 사용불가
//		a.field3 = 1;(x)//private
		
		a.method1();	//public
		
		//같은 패키지 사용가능
		a.method2();	//default
		
		//class A의 바깥쪽, private 사용불가
//		a.method3();	(x)//private
	}
}
