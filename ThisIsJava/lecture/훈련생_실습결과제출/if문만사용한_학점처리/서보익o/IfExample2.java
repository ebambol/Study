package com.java.test2;

public class IfExample2 {

	public static void main(String[] args) {
		int score = 55;
		
		if(100<score) {
			System.out.println("오류100초과");
		}
		if(score<0) {
			System.out.println("오류0미만");
		}
		if(100>=score & score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(90>score & score>=80) {
			System.out.println("점수가 89~80입니다.");
			System.out.println("등급은 B 입니다.");
			}
		if(80>score & score>=70) {
			System.out.println("점수가 79~70입니다.");
			System.out.println("등급은 C 입니다.");
			}
		if(70>score & score>=60) {
			System.out.println("점수가 69~60입니다.");
			System.out.println("등급은 D 입니다.");
			}
		if(60>score & score>=0) {
			System.out.println("점수가 60미만 입니다.");
			System.out.println("등급은 E 입니다.");
			}
		
		
}
}
