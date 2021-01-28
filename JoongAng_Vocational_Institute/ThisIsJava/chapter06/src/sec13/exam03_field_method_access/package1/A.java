package sec13.exam03_field_method_access.package1;

public class A {
	//필드
	public int field1;	//public 	전체 공개
	int field2;			//default 	같은패키지 사용가능
	private int field3;	//private	현재 클래스에서만 사용가능
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
