package com.java.test1;

public interface RemoteControl {
	//	데이터 저장은 못함

	//	상수 멤버
	//	[public static final] int MAX_VOLUME = 10;
	//	[public static final] int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//	추상메소드 멤버
	//	[public abstract] void turnOn();
	public abstract void turnOn();
	public void turnOff();
	void setVolume(int volume);

	//	디폴트메소드 멤버
	//	[public] default void setVolume(boolean mute) {
	default void setVolume(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

	//	정적메소드 멤버
	//	[public] static void changeBetter() {
	static void changeBettery() {
		System.out.println("건전지를 교환합니다.");
	}
}
