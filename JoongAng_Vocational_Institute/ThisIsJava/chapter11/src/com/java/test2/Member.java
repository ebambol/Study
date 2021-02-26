package com.java.test2;

/*
 * implements Cloneable 생략시
 * Exception in thread "main" java.lang.NullPointerException
 */
public class Member  implements Cloneable{	
	//A객체를 이용해서 A객체 복사
	//필드
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	//생성자
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	//메소드
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//Object객체를 clone(복제)후 Member로 캐스팅후 대입
		} catch(CloneNotSupportedException e) {/*예외 실행내용 없음*/ }
		return cloned;
	}
}
