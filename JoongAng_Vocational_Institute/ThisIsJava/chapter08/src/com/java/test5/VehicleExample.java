package com.java.test5;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();	//자동형변환
		vehicle.run();
//		bus.checkFare();	//사용할 수 없다

		Bus bus = (Bus)vehicle;	//강제형변환
		bus.run();
		bus.checkFare();
	}

}
