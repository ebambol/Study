package tire2;

public class Hankook extends Tire{
	public Hankook(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " 한국타이어 남은 내구도 : " + (maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println(location + " 한국타이어 펑크");
			return false;
		}
	}
}
