package com.java.test4;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String strOsName = System.getProperty("os.name");
		String strUserName = System.getProperty("user.name");
		String strUserHome = System.getProperty("user.home");
		
		System.out.println(strOsName);
		System.out.println(strUserName);
		System.out.println(strUserHome);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key +" ]  "+ value);
		}
	}

}
