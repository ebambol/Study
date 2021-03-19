package com.java.test7;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: " + now);
		
		LocalDateTime targetDateTime = null;
		
		//직접 수정
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(21)
				.withHour(4)
				.withMinute(31)
				.withSecond(13);
		System.out.println("직접변경: "+targetDateTime);
		
		//년도 상대변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번해의 첫번째 일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번해의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달의 첫번째 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음달의 첫번째 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY));
		System.out.println("이번달의 첫번째 토요일: " +targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
		System.out.println("이번달의 마지막 토요일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("돌아오는 토요일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
		System.out.println("돌아오는 토요일(오늘 포함) : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
		System.out.println("지난 토요일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY));
		System.out.println("지난 토요일(오늘포함) : "+targetDateTime);
	}

}
