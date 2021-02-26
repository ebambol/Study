package com.java.test4;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		
		Outter.Nested nest = outter.new Nested();	//인스턴스 멤버 클래스 객체 생성
		nest.print();
	}

}
