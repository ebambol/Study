package chap06;

public class CarExample {

	public static void main(String[] args) {
		//��ü ����
		Car mycar = new Car();
		
		//�ʵ� �� �б�
		System.out.println("���� ȸ�� : " + mycar.company);
		System.out.println("�𵨸� : " + mycar.model);
		System.out.println("���� : " + mycar.color);
		System.out.println("�ְ�ӵ� : " + mycar.maxspeed);
		System.out.println("����ӵ� : " + mycar.speed);
		
		//�ʵ尪 ����
		mycar.speed = 60;
		System.out.println("������ �ӵ� : " + mycar.speed);
		
	}

}
