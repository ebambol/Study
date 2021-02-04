package com.java.test2;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
////		switch (problemLocation) {
//			case 1:
//				System.out.println("앞 왼쪽 HankookTire로 교체");
////				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
//				car.tires[0] = new HankookTire("앞왼쪽", 15);
//				break;
//			case 2:
//				System.out.println("앞 오른쪽 KumhoTire로 교체");
////				car.frontRightTire = new KumhoTire("앞 왼쪽", 13);
//				car.tires[1] = new KumhoTire("앞 왼쪽", 13);
//				break;
//			case 3:
//				System.out.println("뒤 왼쪽 HankookTire로 교체");
////				car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
//				car.tires[2] = new HankookTire("뒤 왼쪽", 14);
//				break;
//			case 4:
//				System.out.println("뒤 오른쪽 kumhoTire로 교체");
////				car.backRightTire = new KumhoTire("뒤 오른쪽", 15);
//				car.tires[3] = new KumhoTire("뒤 오른쪽", 15);
//				break;
//			}
			
			if(problemLocation != 0) {	//펑크가 난 경우 1,2,3,4
				System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("--------------------------------");
		}
	}

}
