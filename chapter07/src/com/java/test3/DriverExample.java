package com.java.test3;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(vehicle);
		driver.drive(bus);	//bus�� vehicle�� �ڽ�
		driver.drive(taxi);	//taxi�� vehicle�� �ڽ�
	}
}