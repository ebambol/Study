package com.java.test5;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		//���ڿ��� ã���� ���ڿ��� ���۵Ǵ� �ε������� ����
		//���ڿ��� ã�����ϸ� -1���� ����
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�")!= -1) {
			//"�ڹ�"��� ���ڿ��� ã������ ����
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");
		}
	}

}
