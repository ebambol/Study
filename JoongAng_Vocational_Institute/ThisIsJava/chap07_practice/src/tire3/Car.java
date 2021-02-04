package tire3;

public class Car {
	Tire tires[] = {
			new Tire("FrontLeftTire", 6),
			new Tire("ForntRightTire", 2),
			new Tire("BackLeftTire", 3),
			new Tire("BackRightTire", 4)
	};
	
	public int run(){
		System.out.println("[차가 출발합니다.]");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("[차가 멈춥니다.]");
	}
}
