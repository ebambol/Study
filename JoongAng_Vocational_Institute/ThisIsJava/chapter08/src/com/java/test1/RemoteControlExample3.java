package com.java.test1;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {	//익명 클래스 선언
			public void turnOn() { /*실행문*/ }
			public void turnOff() { /*실행문*/ }	
			public void setVolume(int volume) { /*실행문*/ }
		};
	}

}
