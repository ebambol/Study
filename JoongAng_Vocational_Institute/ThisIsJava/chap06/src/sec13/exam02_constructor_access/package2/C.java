package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.*;

public class C {
	//접근 제한 없음
	A a1 = new A(true);	//public 접근
	
	//패키지가 달라 사용 불가
//	A a2 = new A();	(x) //default 접근
	
	//패키지, 클래스가 달라 사용 불가
//	A a3 = new A("문자열"); (x) //private 접근
}
