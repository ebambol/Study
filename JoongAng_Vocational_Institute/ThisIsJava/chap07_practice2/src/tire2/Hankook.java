package tire2;

public class Hankook extends Tire{
	public Hankook(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " �ѱ�Ÿ�̾� ���� ������ : " + (maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println(location + " �ѱ�Ÿ�̾� ��ũ");
			return false;
		}
	}
}
