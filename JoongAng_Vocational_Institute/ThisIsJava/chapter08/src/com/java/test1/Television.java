package com.java.test1;

public class Television implements RemoteControl {
	//���� Ŭ����
	
	//�ʵ�
	private int volume;

	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	//turnOff() �߻�޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	//setVolume() �߻�޼ҵ��� ��ü �޼ҵ�
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {	//volume>10
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {	//volume<0
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV�� ���� : " + this.volume);
	}
}
