package com.java.test1;

public class Audio implements RemoteControl{
	//구현클래스
	
	//필드
	private int volume;
	
	//turnOn()
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//turnOff()
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 오디오볼륨 : " + this.volume);
	}
}
