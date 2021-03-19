package com.java.test7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);

		System.out.println(now.format(DateTimeFormatter.ofPattern("yy년 M월 d일 a h시  m분")));
	}

}
