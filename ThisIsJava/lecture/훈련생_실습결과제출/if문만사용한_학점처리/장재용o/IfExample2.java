package com.java.test1;

public class IfExample2 {
	public static void main(String[] args) {
		// 90 이상이면 A 등급, 80~89 이면 B 등급, 70~79 이면 C등급, 60~69 이면 D등급, 60점 미만이면 F등급
		// 점수가 0~100 사이 값이 아니면 '입력값 오류'
		// IF문만 사용!!!

		int score = 95;
//		int score = 85;
//		int score = 75;
//		int score = 65;
//		int score = 55;
//		int score = 105;
//		int score = -15;
		
		// IF문 + 논리연산자 이용
/*		
			if(score>=90 && score<100) {
				System.out.println("점수가 90 이상입니다.");
				System.out.println("등급은 A 입니다.");
			}  if(score>=80 && score<90) {
				System.out.println("점수가 80~89 입니다.");
				System.out.println("등급은 B 입니다.");
			}  if(score>=70 && score<80) {
				System.out.println("점수가 70~79 이상입니다.");
				System.out.println("등급은 C 입니다.");
			}  if(score>=60 && score<70) {
				System.out.println("점수가 60~69 이상입니다.");
				System.out.println("등급은 D 입니다.");
			}  if(score>=0 && score<60) {
				System.out.println("점수가 60 미만입니다.");
				System.out.println("등급은 F 입니다.");
			}  if(!(score>=0 && score<=100)) {
			System.out.println("입력값 오류");
			}
*/
		// 다른방법(중첩 IF문)
/*
		if(score>100) {
			System.out.println("입력값 오류(100초과)");
		}
		if(score<0) {
			System.out.println("입력값 오류(0미만)");
		}
		if(score<=100) {
			if(score>=90) {
				System.out.println("점수가 90 이상입니다.");
				System.out.println("등급은 A 입니다.");
			}
			if(score<90) {
				if(score>=80) {
					System.out.println("점수가 80~89 사이입니다.");
					System.out.println("등급은 B 입니다.");
				}
				if(score<80) {
					if(score>=70) {
						System.out.println("점수가 70~79 사이입니다.");
						System.out.println("등급은 C 입니다.");
					}
					if(score<70) {
						if(score>=60) {
							System.out.println("점수가 60~69 사이입니다.");
							System.out.println("등급은 D 입니다.");
						}
						if(score<60) {
							if(score>=0) {
								System.out.println("점수가 60 미만입니다.");
								System.out.println("등급은 F 입니다.");
							}
						}
					}
				}
			}
		}
*/
	}			
}
