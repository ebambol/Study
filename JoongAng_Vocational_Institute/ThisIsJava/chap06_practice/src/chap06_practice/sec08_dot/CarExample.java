package chap06_practice.sec08_dot;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();

		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("����ӵ�: " + speed + "km/h");
	}

}
