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
		
		//name() �޼ҵ�	: ���� ��ü�� ���ڿ� ����
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() �޼ҵ� : ���� ��ü�� ������ ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() �޼ҵ�	: ���� ��ü�� ���ؼ� ���� ���̸� ����
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ� : �־��� ���ڿ��� ���� ��ü�� ����
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��̱���");
			}else {
				System.out.println("�����̱���");
			}
		}
		
		//values() �޼ҵ� : ��� ���Ű�ü���� �迭�� ����
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
