package com.java.test1;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new Television();
		rc = new Audio();
		rc.turnOn();	//TV�� �մϴ�.
		rc.turnOff();	//TV�� ���ϴ�.
		rc.setVolume(5);//���� TV�� ���� : 5
		rc.setVolume(15);//���� TV�� ���� : 10
		rc.setVolume(-5);//���� TV�� ���� : 0
		rc.setVolume(true);
		rc.setVolume(false);
		RemoteControl.changeBettery();	//static�� ���� -> �������̽���.���(�޼ҵ�)
	}

}
