package cellphone;

public class DmbCellPhone extends CellPhone{
	//�ʵ�
	int channel;
	
	//������
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� "+ channel + "�� DMB ����� �����մϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ����� �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+ channel + "������ �ٲߴϴ�.");
	}
	
}