package com.java.project;

import java.util.Scanner;

public class Rock {
public static void main(String[] args) {
	/*
	 * 
	 * 
	 * �Է�: ���� ���� ��  ���Ͷ� ���������� �� ��� �̤����� �¸� or�й� ���º�
	 * math.random 1 ,2 , 3 
	 *
	 * */
	boolean s = true;
	String computer="";
	Scanner sc = new Scanner(System.in);	
	while(s) {
	System.out.print("���� ���� �� �Է�:"); String user = sc.next();
	
	int Computer = (int)(Math.random()*3 +1);
	
	if(Computer ==1) {
		computer="����";
	}
	if(Computer ==2) {
		computer="����";
	}
	if(Computer ==3) {
		computer="��";
	}
	System.out.println("computer:"+computer);
	System.out.println("user:"+user);
	
	if(computer.equals(user)) {
		System.out.println("���º�");
	}
	
	if(computer.equals("����") && user.equals("����")) {
		System.out.println("�¸�");
		s=false;
	}else if(computer.equals("����") && user.equals("��")) {
		System.out.println( "�й�");
	}
	if(computer.equals("����") && user.equals("��")) {
		System.out.println( "�¸�");
		s=false;
	}else if(computer.equals("����") && user.equals("����")) {
		System.out.println( "�й�");
	}
	if(computer.equals("��") && user.equals("����")) {
		System.out.println( "�¸�");
		s=false;
	}else if(computer.equals("��") && user.equals("����")) {
		System.out.println( "�й�");
	}

}
	
}
	
}
