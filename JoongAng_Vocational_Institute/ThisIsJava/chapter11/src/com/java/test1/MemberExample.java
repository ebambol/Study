package com.java.test1;

public class MemberExample {

	public static void main(String[] args) {
		//필드
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
//		System.out.println(obj1.hashCode());	//3027034
//		System.out.println(obj2.hashCode());	//3027034
//		System.out.println(obj3.hashCode());	//112785
		
		//생성자
		
		//메소드
		//매개값이 Member타입이고 id필드값이 동일
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		//매개값이 Member타입이지만 id필드값이 다름
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}

}
