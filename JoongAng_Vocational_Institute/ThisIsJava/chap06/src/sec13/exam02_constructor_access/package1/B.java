package sec13.exam02_constructor_access.package1;

public class B {
	//같은 패키지 가능
	A a1 = new A(true);	//public 접근
	A a2 = new A();	//default 접근
	
	//같은 패키지이지만 클래스가 달라 접근 못함
//	A a3 = new A("문자열");	(x) //private 접근
}
