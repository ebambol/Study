package com.java.test7;

import java.util.TimeZone;

public class PrintTimeZoneID {
	//타임존 id값을 리턴
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}

}
