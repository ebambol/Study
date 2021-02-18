package com.java.test1;

public class Audio2 implements RemoteControl{
	//����Ŭ����
	
	//�ʵ�
	private int volume;
	private boolean mute;	//�߰���
	
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
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
}