package sec03.exam01_name_implement_class;

public interface RemoteControl {
	public static final int MAX_VALUME = 10;
	int MIN_VALUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
