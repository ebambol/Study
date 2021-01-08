package com.java.test1;

public class IfExample {
	public static void main(String[] args) {
		int score = 90;

		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");	//{}생략시 여기까지가 if블럭
			System.out.println("등급은 A 입니다.");
		}
		if(score < 90)  {
			System.out.println("점수가 90보다 작습니다"); //{}생략시 여기까지가 if블럭
			System.out.println("등급은 B 입니다.");
		}
	}
}
