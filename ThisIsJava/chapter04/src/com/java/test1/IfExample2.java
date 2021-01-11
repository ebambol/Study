package com.java.test1;
public class IfExample2 {
	public static void main(String[] args) {
//		100~90이상 이면 A 등급
//		89 ~ 80이면 B 등급
//		79 ~ 70이면 C 등급
//		69 ~ 60이면 D 등급
//		60점 미만이면 F등급
//		점수가 0~100 사이 값이 아니면 "입력값 오류 "출력
		

//  직접 작성
		int score = (int)(Math.random() * 100);
		System.out.println(score);

//		입력값 오류 출력
		if(score > 100) {
			System.out.println("입력값 오류 (100초과)");
		}
		if(score < 0) {
			System.out.println("입력값 오류 (0미만)");
		}
//		등급 출력
		if(score >= 90) {
			if(score < 100)  {
				System.out.println("등급은 A 입니다.");
			}	
		}
		if(score <= 89) {
			if(score >= 80)  {
				System.out.println("등급은 B 입니다.");
			}	
		}
		if(score <= 79) {
			if(score >= 70)  {
				System.out.println("등급은 C 입니다.");
			}	
		}
		if(score <= 69) {
			if(score > 60)  {
				System.out.println("등급은 D 입니다.");
			}	
		}
		if(score <= 60) {
			if(score >= 0)  {
				System.out.println("등급은 F 입니다.");
			}	
		}

/*
 * 직접 작성한 코드
		int score = 100;

		if(90 <= score && score <= 100) {
			System.out.println("등급은 A 입니다.");
		} if(80 <= score && score <= 89) {
			System.out.println("등급은 B 입니다.");
		} if(70 <= score && score <= 79) {
			System.out.println("등급은 C 입니다.");
		} if(60 <= score && score <= 69) {
			System.out.println("등급은 D 입니다.");
		} if(0 <= score && score < 60) {
			System.out.println("등급은 F 입니다.");
		} if (!(0 <= score && score <=100)){
			System.out.println("입력값 오류");
		}
		*/
	}
}

