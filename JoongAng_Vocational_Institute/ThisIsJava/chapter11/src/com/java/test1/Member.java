package com.java.test1;

public class Member {
	//�ʵ�
	public String id;
	
	//������
	public Member(String id) {
		this.id = id;
	}
	
	//�޼ҵ�
	@Override
	public boolean equals(Object obj) {
		//�Ű����� MemberŸ������ Ȯ��
		if(obj instanceof Member) {
			//ĳ����
			Member member = (Member) obj;
			//id�ʵ尪�� �������� Ȯ��
			if(id.equals(member.id)) {
				//true ����
				return true;
			}
		}
		//MemberŸ���� �ƴϰų� �ʵ尪�� �ٸ�
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
