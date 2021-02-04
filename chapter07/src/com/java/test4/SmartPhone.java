package com.java.test4;

public class SmartPhone extends Phone{
	//필드
	
	//생성자
	public SmartPhone (String owner) {
		super(owner);
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
