package com.java.test1;

public class IfExample2 {
//90~100 -> A���
//80~89  -> B���
//70~79  -> C���
//60~69  -> D���
//0~60�̸� -> F���
//������ 0~100���� �ƴϸ� '�Է°� ����'
	
	public static void main(String[] args) {
		int score = 200;
		
		if((score >= 90) && (score <= 100)) {
			System.out.println("A");
		}

		if((score >= 80) && (score <= 89)) {
			System.out.println("B");
		}

		if((score >= 70) && (score <= 79)) {
			System.out.println("C");
		}

		if((score >= 60) && (score <= 69)) {
			System.out.println("D");
		}

		if((score >= 0) && (score < 60)) {
			System.out.println("F");
		}

		if(!(score >= 0) || !(score <=100)) {
			System.out.println("!�Է°� ����! �߸� �Է� �ϼ̽��ϴ�.");
	    }
    }
	
}