package com.java.test6;

public class Member implements Comparable<Member>{
	//필드
	String name;
	
	//생성자
	Member(String name){
		this.name = name;
	}
	
	//메소드
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		//오름차순 기준으로
		//기준값이 매개값보다 낮을 경우 음수		기준값<매개값	음수
		//기준값이 매개값보다 높을 경우 양수		기준값>매개값	양수
		//기준값과 매개값이 같을 경우 0 리턴		기준값=매개값	0
	}

}
