package supersonicAriplane;

public class SuperSonicAirplane extends Airplane{
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = 1;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			//Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
		}
	}
}
