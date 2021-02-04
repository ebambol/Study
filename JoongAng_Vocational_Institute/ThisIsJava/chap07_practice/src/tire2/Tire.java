package tire2;

public class Tire {
	//�ʵ�
	public int maxRotation;	//�ִ� ȸ����
	public int accumulatedRotation;	//���� ȸ����
	public String location;
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Ÿ�̾� ���� : " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
