package tire;

public class Car {
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);		//return 1
	Tire frontRightTire = new Tire("�տ�����", 2);		//return 2
	Tire backLeftTire = new Tire("�ڿ���", 3);		//return 3
	Tire backRightTire = new Tire("�ڿ�����", 4);		//return 4
	
	//������
	
	//�޼ҵ�
	public int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}