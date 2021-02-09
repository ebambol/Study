package tire2;

public class Car {
	//필드
	Tire[] tires = {
		new Tire("앞왼쪽", 6),
		new Tire("앞오른쪽", 4),
		new Tire("뒤왼쪽", 2),
		new Tire("뒤오른쪽", 1)
	};
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("달립니다.");
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {stop(); return(i+1); }
		}
		return 0;
	}
	public void stop() {
		System.out.println("멈춥니다.");
	}
}
