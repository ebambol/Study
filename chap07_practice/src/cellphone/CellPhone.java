package cellphone;

public class CellPhone {
	//�ʵ�
	String model;
	String color;
	
	//������
	
	//�޼ҵ�
	void powerUp() { System.out.println("������ �մϴ�"); }
	void powerOff() { System.out.println("������ ���ϴ�"); }
	void bell() { System.out.println("���� �︳�ϴ�."); }
	void sendVoice(String message) { System.out.println(message); }
	void receiveVoice(String message) { System.out.println(message); }
	void hangUp() { System.out.println("��ȭ�� �����ϴ�."); }
}
