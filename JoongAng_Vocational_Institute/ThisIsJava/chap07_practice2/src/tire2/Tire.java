package tire2;

public class Tire {
	//필드
	public int maxRotation;	//최대회전수
	public int accumulatedRotation;	//누적회전수
	public String location;	//위치

	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " 바퀴 남은 내구도 : " + (maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println(location + " 바퀴 펑크");
			return false;
		}
	}
	
}
