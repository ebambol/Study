package com.java.test5;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();	//�ڵ�����ȯ
		vehicle.run();
//		bus.checkFare();	//����� �� ����

		Bus bus = (Bus)vehicle;	//��������ȯ
		bus.run();
		bus.checkFare();
	}

}
