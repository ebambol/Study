package com.java.test1;

public class MemberExample {

	public static void main(String[] args) {
		//�ʵ�
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
//		System.out.println(obj1.hashCode());	//3027034
//		System.out.println(obj2.hashCode());	//3027034
//		System.out.println(obj3.hashCode());	//112785
		
		//������
		
		//�޼ҵ�
		//�Ű����� MemberŸ���̰� id�ʵ尪�� ����
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		//�Ű����� MemberŸ�������� id�ʵ尪�� �ٸ�
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
