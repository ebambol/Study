package com.java.test1;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
//			if(i%2!=0) {	//0�� �ƴϸ� true, 0�̸� false
			if(i%2==1) {	//�������� 1�̸� Ȧ�� , 0�̸� ¦��	
				System.out.println(i +" Ȧ�� continue");
				continue;	//for-������ while-���ǽ�
			}
			System.out.println(i);
		}
	}

}
