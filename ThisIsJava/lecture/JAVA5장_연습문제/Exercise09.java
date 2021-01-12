package com.java.test;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println(studentNum+"명");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				System.out.println("학생수 >");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				System.out.println("점수입력 >");
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]>");
					scores[i]=scanner.nextInt();
				}
			}else if(selectNo == 3) {
				System.out.println("점수리스트 >");
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
			}else if(selectNo == 4) {
				System.out.println("분석 >");
				int max=0; //최대값 저장
				int sum=0; //성적 합계 저장
				for(int i=0; i<scores.length;i++) {
					sum = sum + scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고점수: "+max);
				System.out.println("평균점수: "+(double)sum/studentNum);
			}else if(selectNo == 5) {
				System.out.println("5번 선택");
				run=false;
			}
		} // End of while()
		System.out.println("프로그램 종료");
	}
}
