package com.java.test1;

public class Audio implements RemoteControl{
	//����Ŭ����
	
	//�ʵ�
	private int volume;
	
	//turnOn()
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	//turnOff()
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}	
	//setVolume()
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ��������� : " + this.volume);
	}
}
