package com.java.example;
public class IfExample2 {
	public static void main(String[] args) {
		int score = 59;
		
		if(score>100) {
			System.out.println("�Է°�����! 100�ʰ��� �� �Դϴ�. ");
		}
		
		if(score<0) {
			System.out.println("�Է°�����! 0�̸��� �� �Դϴ�.");
		}
		
		if(score<=100)
			if(score>=90) {
				System.out.println("������ 100 ~ 90�� A��� �Դϴ�.");
		}
		
		if(score<90)
			if(score>=80) {
			System.out.println("������ 90 ~ 80�� B����Դϴ�.");
		}
		
		if(score<80)
			if(score>=70) {
			System.out.println("������ 80 ~ 70�� C����Դϴ�.");
		}
		
		if(score<70)
			if(score>=60) {
			System.out.println("������ 70 ~ 60�� D��� �Դϴ�.");
		}
		
		if(score<60) 
			if(score>0) {
			System.out.println("������ 60���̸� F��� �Դϴ�.����!!");
		}
		


		/*
		 * if((score<=100)&&(score>=90)) {
		 * 
		 * System.out.println("������ 100 ~ 90�� �Դϴ�."); System.out.println("����� A��� �Դϴ�.");
		 * 
		 * }if((score<=90)&&score>=80) {
		 * 
		 * System.out.println("������ 89 ~ 80�� �Դϴ�."); System.out.println("����� B��� �Դϴ�.");
		 * 
		 * }if((score<=80)&&score>=70) {
		 * 
		 * System.out.println("������ 79 ~ 70�� �Դϴ�."); System.out.println("����� C��� �Դϴ�.");
		 * 
		 * }if((score<=70)&&score>=60){
		 * 
		 * System.out.println("������ 69 ~ 60�� �Դϴ�"); System.out.println("����� D��� �Դϴ�.");
		 * 
		 * }if((score>=0)&&score<60){
		 * 
		 * System.out.println("������ 60�� �̸��Դϴ�"); System.out.println("����� F��� �Դϴ�.");
		 * 
		 * }if((score>=100)||(score<=0)){ System.out.println("�Է°�����"); }
		 */
	}
}