package tire2;

public class Tire {
	//�ʵ�
	public int maxRotation;	//�ִ�ȸ����
	public int accumulatedRotation;	//����ȸ����
	public String location;	//��ġ

	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " ���� ���� ������ : " + (maxRotation-accumulatedRotation));
			return true;
		} else {
			System.out.println(location + " ���� ��ũ");
			return false;
		}
	}
	
}
