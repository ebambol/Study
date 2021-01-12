package com.java.project;

import java.util.Scanner;

public class Rock {
public static void main(String[] args) {
	/*
	 * 
	 * 
	 * 입력: 가위 바위 보  컴터랑 가위바위보 한 결과 ㅜㅊㄹ력 승리 or패배 무승부
	 * math.random 1 ,2 , 3 
	 *
	 * */
	boolean s = true;
	String computer="";
	Scanner sc = new Scanner(System.in);	
	while(s) {
	System.out.print("가위 바위 보 입력:"); String user = sc.next();
	
	int Computer = (int)(Math.random()*3 +1);
	
	if(Computer ==1) {
		computer="가위";
	}
	if(Computer ==2) {
		computer="바위";
	}
	if(Computer ==3) {
		computer="보";
	}
	System.out.println("computer:"+computer);
	System.out.println("user:"+user);
	
	if(computer.equals(user)) {
		System.out.println("무승부");
	}
	
	if(computer.equals("가위") && user.equals("바위")) {
		System.out.println("승리");
		s=false;
	}else if(computer.equals("가위") && user.equals("보")) {
		System.out.println( "패배");
	}
	if(computer.equals("바위") && user.equals("보")) {
		System.out.println( "승리");
		s=false;
	}else if(computer.equals("바위") && user.equals("가위")) {
		System.out.println( "패배");
	}
	if(computer.equals("보") && user.equals("가위")) {
		System.out.println( "승리");
		s=false;
	}else if(computer.equals("보") && user.equals("바위")) {
		System.out.println( "패배");
	}

}
	
}
	
}
