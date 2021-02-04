package tire3;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookŸ�̾� ���� : " + (maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + " �� ��ũ�� ***");
			return false;
		}
	}
}
