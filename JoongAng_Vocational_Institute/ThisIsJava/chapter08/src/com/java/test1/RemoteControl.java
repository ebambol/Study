package com.java.test1;

public interface RemoteControl {
	//	������ ������ ����

	//	��� ���
	//	[public static final] int MAX_VOLUME = 10;
	//	[public static final] int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//	�߻�޼ҵ� ���
	//	[public abstract] void turnOn();
	public abstract void turnOn();
	public void turnOff();
	void setVolume(int volume);

	//	����Ʈ�޼ҵ� ���
	//	[public] default void setVolume(boolean mute) {
	default void setVolume(boolean mute) {
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		} else {
			System.out.println("���� ���� �մϴ�.");
		}
	}

	//	�����޼ҵ� ���
	//	[public] static void changeBetter() {
	static void changeBettery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
