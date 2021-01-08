package com.java.test1;

public class IfElseIfElseExample {
	public static void main(String[] args) {
//		int score = 75;
		int score = (int)(Math.random()*100);
		System.out.println("점수 : " + score);
		
		if(score >= 90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C 입니다.");
		} else if (score >= 60) {
			System.out.println("점수가 60~69입니다");
			System.out.println("등급은 D 입니다.");
		} else {
			System.out.println("점수가 60미만 입니다");
			System.out.println("등급은 F 입니다.");
		}
	}
}
