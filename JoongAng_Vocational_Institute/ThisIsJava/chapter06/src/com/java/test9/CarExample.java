package com.java.test9;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		//�߸��� �ӵ� ����
		myCar.setSpeed(-60);
		System.out.println("���� �ӵ� : " + myCar.getSpeed());

		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("���� �ӵ� : " + myCar.getSpeed());

		//����
		myCar.setStop(true);
		System.out.println("myCar.isStop() : " + myCar.isStop());

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}

}
