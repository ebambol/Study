package com.java.test6;

public class Member implements Comparable<Member>{
	//�ʵ�
	String name;
	
	//������
	Member(String name){
		this.name = name;
	}
	
	//�޼ҵ�
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		//�������� ��������
		//���ذ��� �Ű������� ���� ��� ����		���ذ�<�Ű���	����
		//���ذ��� �Ű������� ���� ��� ���		���ذ�>�Ű���	���
		//���ذ��� �Ű����� ���� ��� 0 ����		���ذ�=�Ű���	0
	}

}
