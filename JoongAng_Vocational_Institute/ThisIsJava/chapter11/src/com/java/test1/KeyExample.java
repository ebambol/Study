package com.java.test1;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap <Key, String> ();
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� ������
		hashMap.put(new Key(1),"ȫ�浿");
		hashMap.put(new Key(2),"�̼���");
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� �ҷ���
		String value = hashMap.get(new Key(1));
		String value2 = hashMap.get(new Key(2));
		System.out.println(value);
		System.out.println(value2);
	}

}
