package com.java.test1;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new Television();
		rc = new Audio();
		rc.turnOn();	//TV를 켭니다.
		rc.turnOff();	//TV를 끕니다.
		rc.setVolume(5);//현재 TV의 볼륨 : 5
		rc.setVolume(15);//현재 TV의 볼륨 : 10
		rc.setVolume(-5);//현재 TV의 볼륨 : 0
		rc.setVolume(true);
		rc.setVolume(false);
		RemoteControl.changeBettery();	//static은 사용법 -> 인터페이스명.상수(메소드)
	}

}
