package com.java.test7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatetimeParsingExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2021-03-18");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.BASIC_ISO_DATE;
		localDate = LocalDate.parse("20210318",formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_DATE;
		localDate = LocalDate.parse("2021-03-18+09:00",formatter);
//		localDate = LocalDate.parse("2021-03-18",formatter);	이것도 가능
		System.out.println(localDate);

		formatter = DateTimeFormatter.ISO_OFFSET_DATE;
		localDate = LocalDate.parse("2021-03-18+09:00",formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = localDate.parse("2021-03-18",formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yy.M.d");
		localDate = localDate.parse("21.3.18",formatter);
		System.out.println(localDate);
	}

}
