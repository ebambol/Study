package com.java.test7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� a h�� m��");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);

		System.out.println(now.format(DateTimeFormatter.ofPattern("yy�� M�� d�� a h��  m��")));
	}

}
