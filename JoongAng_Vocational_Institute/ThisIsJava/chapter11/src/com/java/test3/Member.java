package com.java.test3;

import java.util.Arrays;

public class Member implements Cloneable{
	//필드
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	//생성자
	public Member (String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	//메소드
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();	//Object clone() 호출
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//재정의된 Object clone()메소드 호출
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
