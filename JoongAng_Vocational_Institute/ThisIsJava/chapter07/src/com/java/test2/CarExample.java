package com.java.test2;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
////		switch (problemLocation) {
//			case 1:
//				System.out.println("�� ���� HankookTire�� ��ü");
////				car.frontLeftTire = new HankookTire("�տ���", 15);
//				car.tires[0] = new HankookTire("�տ���", 15);
//				break;
//			case 2:
//				System.out.println("�� ������ KumhoTire�� ��ü");
////				car.frontRightTire = new KumhoTire("�� ����", 13);
//				car.tires[1] = new KumhoTire("�� ����", 13);
//				break;
//			case 3:
//				System.out.println("�� ���� HankookTire�� ��ü");
////				car.backLeftTire = new HankookTire("�� ����", 14);
//				car.tires[2] = new HankookTire("�� ����", 14);
//				break;
//			case 4:
//				System.out.println("�� ������ kumhoTire�� ��ü");
////				car.backRightTire = new KumhoTire("�� ������", 15);
//				car.tires[3] = new KumhoTire("�� ������", 15);
//				break;
//			}
			
			if(problemLocation != 0) {	//��ũ�� �� ��� 1,2,3,4
				System.out.println(car.tires[problemLocation-1].location + " HankookTire�� ��ü");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("--------------------------------");
		}
	}

}
