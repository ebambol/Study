package com.java.test;

public class CarExample {

	public static void main(String[] args) {
		// Car Ŭ���� Ÿ���� ��ü ����
		Car myCar= new Car();

		//�ʵ� �� �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxspeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
//		���氪 ���
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " +myCar.speed);
		myCar.company = "�ֿ��ڵ���";
		System.out.println("������ ȸ���̸� : " + myCar.company);
		
//		���������� �Ѱ�
		System.out.println(myCar.st.name);
	}

}
