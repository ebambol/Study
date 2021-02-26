package com.java.test2;

public class MemberExample {

	public static void main(String[] args) {
		//thin clone(얕은복제) : 기본자료형 + String 타입의 필드 복제
		//원본 객체 생성
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("cloned.id : " + cloned.id);
		System.out.println("cloned.name : " + cloned.name);
		System.out.println("cloned.password : " + cloned.password);
		System.out.println("cloned.age : " + cloned.age);
		System.out.println("cloned.adult : " + cloned.adult);
		
		System.out.println();

		System.out.println("[원본 객체의 필드값]");
		System.out.println("original.id : " + original.id);
		System.out.println("original.name : " + original.name);
		System.out.println("original.password : " + original.password);
		System.out.println("original.age : " + original.age);
		System.out.println("original.adult : " + original.adult);
	}

}
