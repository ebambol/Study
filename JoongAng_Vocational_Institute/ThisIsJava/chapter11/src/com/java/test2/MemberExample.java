package com.java.test2;

public class MemberExample {

	public static void main(String[] args) {
		//thin clone(��������) : �⺻�ڷ��� + String Ÿ���� �ʵ� ����
		//���� ��ü ����
		Member original = new Member("blue", "ȫ�浿", "12345", 25, true);
		
		//���� ��ü�� ���� �Ŀ� �н����� ����
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("cloned.id : " + cloned.id);
		System.out.println("cloned.name : " + cloned.name);
		System.out.println("cloned.password : " + cloned.password);
		System.out.println("cloned.age : " + cloned.age);
		System.out.println("cloned.adult : " + cloned.adult);
		
		System.out.println();

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("original.id : " + original.id);
		System.out.println("original.name : " + original.name);
		System.out.println("original.password : " + original.password);
		System.out.println("original.age : " + original.age);
		System.out.println("original.adult : " + original.adult);
	}

}
