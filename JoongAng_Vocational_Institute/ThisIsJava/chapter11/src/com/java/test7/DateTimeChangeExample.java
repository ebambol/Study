package com.java.test7;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("����: " + now);
		
		LocalDateTime targetDateTime = null;
		
		//���� ����
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(21)
				.withHour(4)
				.withMinute(31)
				.withSecond(13);
		System.out.println("��������: "+targetDateTime);
		
		//�⵵ ��뺯��
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("�̹����� ù��° ��: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("�̹����� ������ ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹����� ù��° ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("�̹����� ������ ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("�������� ù��° ��: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY));
		System.out.println("�̹����� ù��° �����: " +targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
		System.out.println("�̹����� ������ �����: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("���ƿ��� ����� : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
		System.out.println("���ƿ��� �����(���� ����) : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
		System.out.println("���� ����� : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY));
		System.out.println("���� �����(��������) : "+targetDateTime);
	}

}
