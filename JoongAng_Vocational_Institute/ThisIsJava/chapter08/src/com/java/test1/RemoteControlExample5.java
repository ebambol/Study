package com.java.test1;

public class RemoteControlExample5 {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(true);
		
		rc = new Audio2();
		rc.turnOn();
		rc.setVolume(true);
		
	}
}
