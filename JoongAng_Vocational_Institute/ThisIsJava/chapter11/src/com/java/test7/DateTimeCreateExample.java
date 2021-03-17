package com.java.test7;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) throws InterruptedException {
		// ��¥ ���
		LocalDate currDate = LocalDate.now();
		System.out.println("���糯¥: " + currDate);

		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("��ǥ��¥: " + targetDate + "\n");

		// �ð� ���
		LocalTime currTime = LocalTime.now();
		System.out.println("����ð�: " + currTime);

		// of(int �ð�, int ��, int ��, int ������)
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("��ǥ�ð�: " + targetTime + "\n");

		// ��¥�� �ð� ���
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð�: " + currDateTime);

		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("��ǥ ��¥�� �ð�: " + targetDateTime + "\n");

		// ���� ����ÿ� �ð���(TimeZone)
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �����: " + utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð���: " + newyorkDateTime);
		ZonedDateTime londonDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println("���� �ð���: " + londonDateTime + "\n");
		
		// Ư�� ������ Ÿ�ӽ����� ���
		Instant instant1 = Instant.now();
		System.out.println("instant1: " + instant1);
		Thread.sleep(10);	//10ms��ŭ ��
		Instant instant2 = Instant.now();
		System.out.println("instant2: " + instant2);
		if (instant1.isBefore(instant2)) {
			System.out.println("instant1�� �����ϴ�.");
		} else if (instant1.isAfter(instant2)) {
			System.out.println("instant1�� �����ϴ�.");
		} else {
			System.out.println("������ �ð��Դϴ�.");
		}
		
		System.out.println("���� �ð��� ����ð� ������ :" + currDateTime.until(newyorkDateTime, ChronoUnit.MINUTES));
		System.out.println("����(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
		System.out.println("����(micros): " + instant1.until(instant2, ChronoUnit.MICROS));
		System.out.println("����(milles): " + instant1.until(instant2, ChronoUnit.MILLIS));
		System.out.println("����(seconds): " + instant1.until(instant2, ChronoUnit.SECONDS));

	}

}
