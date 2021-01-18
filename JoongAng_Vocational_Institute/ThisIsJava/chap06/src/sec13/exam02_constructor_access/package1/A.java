package sec13.exam02_constructor_access.package1;

public class A {
	//현재 클래스에서는 다 사용가능
	A a1 = new A(true);	//public 접근
	A a2 = new A();	//default 접근
	A a3 = new A("문자열");	//private 접근
	
	public A(boolean b) {}	//public
	A() {}	//default
	private A(String s) {}	//private
}
