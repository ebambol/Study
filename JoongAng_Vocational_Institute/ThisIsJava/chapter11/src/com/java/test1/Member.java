package com.java.test1;

public class Member {
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}
	
	//메소드
	@Override
	public boolean equals(Object obj) {
		//매개값이 Member타입인지 확인
		if(obj instanceof Member) {
			//캐스팅
			Member member = (Member) obj;
			//id필드값이 동일한지 확인
			if(id.equals(member.id)) {
				//true 리턴
				return true;
			}
		}
		//Member타입이 아니거나 필드값이 다름
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
