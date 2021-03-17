package com.java.test7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "�� ";
		strDateTime += now.getMonthValue() + "�� ";
		strDateTime += now.getDayOfMonth() + "�� ";
		strDateTime += now.getHour() + "�� ";
		strDateTime += now.getMinute() + "�� ";
		strDateTime += now.getSecond() + "�� ";
		strDateTime += now.getNano() + "������ ";
		
		System.out.println(strDateTime + "\n");
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("���ش� ����: 2�� 29�ϱ��� �ֽ��ϴ�.\n");
		} else {
			System.out.println("���ش� ���: 2�� 28�ϱ��� �ֽ��ϴ�.\n");
		}
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �ð��: " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� Ÿ����: " + seoulDateTime);
		System.out.println("���� �����̵�: " + seoulDateTime.getZone());
		System.out.println("���� ��������: " + seoulDateTime.getOffset());
		System.out.println(seoulDateTime.getChronology());	//������� �޷� �ý��� ���
	}

}
