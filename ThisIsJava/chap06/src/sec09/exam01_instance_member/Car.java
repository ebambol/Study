package sec09.exam01_instance_member;

public class Car {
	//인스턴스 필드
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i);
//			this.setSpeed(i);

			System.out.println(this.model+"이 달립니다.(시속:" + this.speed + "km/h)");
//			System.out.println(model+"이 달립니다.(시속:" + speed + "km/h)");
		}
	}
}
