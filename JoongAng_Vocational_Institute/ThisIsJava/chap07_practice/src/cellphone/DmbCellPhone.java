package cellphone;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	//생성자
	DmbCellPhone (String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	//메소드
	void turnOnDmb() {
		System.out.println("채널 + " + channel + " 번 DMB");
	}
	void changeChannelDmb (int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + " 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 종료");
	}
}
