package sec04.exam03_static_method_use;

public interface RemoteControl {
	public static final int MAX_VALUME = 10;
	int MIN_VALUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default �޼ҵ�
	//������ü �ʿ�,	RemoteControl.setMute (x)
	default void setMute(boolean mute) {	
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	//static �޼ҵ�
	//������ü �ʿ����, RemoteControl.changeBattery (o)
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}
