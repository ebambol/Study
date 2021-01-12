package com.java.test;

public class EnumMethodExample {

	public static void main(String[] args) {
		/*
		 * public enum Week {
				MONDAY,		//0
				TUESDAY,	//1
				WEDNESDAY,	//2
				THURDAY,	//3
				FRIDAY,		//4
				SATURDAY,	//5
				SUNDAY		//6
			}
		 */
		
		//name() 메소드	: 열거 객체의 문자열 리턴
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드 : 열거 객체의 순번을 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드	: 열거 객체를 비교해서 순번 차이를 리턴
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드 : 주어진 문자열의 열거 객체를 리턴
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			}else {
				System.out.println("평일이군요");
			}
		}
		
		//values() 메소드 : 모든 열거객체들을 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
