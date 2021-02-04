package tire2;

public class Car {
	//필드
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
//	Tire frontLeftTire = new Tire("앞왼쪽", 6);		//return 1
//	Tire frontRightTire = new Tire("앞오른쪽", 2);		//return 2
//	Tire backLeftTire = new Tire("뒤왼쪽", 3);		//return 3
//	Tire backRightTire = new Tire("뒤오른쪽", 4);		//return 4
	
	//생성자
	
	//메소드
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		return 0;
//		if(frontLeftTire.roll() == false) {
//			stop();
//			return 1;
//		}
//		if(frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if(backLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if(backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
//		return 0;
	}
	
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
