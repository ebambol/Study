package com.java.test1;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {	//�͸� Ŭ���� ����
			public void turnOn() { /*���๮*/ }
			public void turnOff() { /*���๮*/ }	
			public void setVolume(int volume) { /*���๮*/ }
		};
	}

}
