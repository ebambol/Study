package com.java.test7;

import java.util.TimeZone;

public class PrintTimeZoneID {
	//Ÿ���� id���� ����
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}

}
