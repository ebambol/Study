package com.java.test5;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		//��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();	//���� ��ū�� int����
		for (int i= 0 ; i<countTokens; i++) {
			String token = st.nextToken();	//��ū�� �ϳ��� ������
			System.out.println(token);
		}
		
		System.out.println();
		
		//���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {	//token�� ������ Ȯ�� true/false
			String token = st.nextToken();	//��ū�� �ϳ��� ������
			System.out.println(token);
		}
	}

}
