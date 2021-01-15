package com.java.test;

public class CarExample {

	public static void main(String[] args) {
		// Car 클래스 타입의 객체 생성
		Car myCar= new Car();

		//필드 값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxspeed);
		System.out.println("현재속도 : " + myCar.speed);
		
//		변경값 출력
		myCar.speed = 60;
		System.out.println("수정된 속도 : " +myCar.speed);
		myCar.company = "쌍용자동차";
		System.out.println("수정된 회사이름 : " + myCar.company);
		
//		개인적으로 한거
		System.out.println(myCar.st.name);
	}

}
