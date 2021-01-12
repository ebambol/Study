package com.java.test1;

public class IfExample2 {

	public static void main(String[] args) {
		int csore = 95;
		//100 ~ 90 이면 A 등급
		//89 ~ 80 이면 B 등급
		//79 ~ 70 이면 C 등급
		//69 ~ 60 이면 D 등급
		//60점 미만 이면 F 등급
		// 점수가 0 ~ 100 사이 값이 아니면 '입력값오류'
		if(csore<=100 && csore>= 90) { //100 보다 크거나 같고 그리고 90보다 작거나 같다
			System.out.println("점수가 100~90.");
			System.out.println("등급은 A 입니다.");
		}
		if(csore <90 && csore>=80) { // 90보다 작거나 그리고 80보다 크거나 같다
			System.out.println("점수가89~80.");
			System.out.println("등급은 B 입니다.");			
		}
		if(csore <80 && csore>=70) { // 80보다 작거나 그리고 70보다 크거나 같다
			System.out.println("점수가79~70.");
			System.out.println("등급은 C 입니다.");			
		}
		if(csore <70 && csore>=60) { // 70보다 작거나 그리고 60보다 크거나 같다
			System.out.println("점수가 69~60.");
			System.out.println("등급은 D 입니다.");			
		}
		if(csore <60 && csore>=0) { // 60보다 작거나 그리고 0보다 크거나 같다
			System.out.println("점수가 59~0");
			System.out.println("등급은 F 입니다.");
		}
		if(csore>100 || csore<0){ //100보다 크거나 그리고 0보다 작다
			System.out.println("0 ~ 100 사이값이 아니다");
			System.out.println("입력값오류");
		}
		

	}

}
