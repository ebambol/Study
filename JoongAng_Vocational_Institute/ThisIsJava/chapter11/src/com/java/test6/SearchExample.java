package com.java.test6;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);
		
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: " + index);

		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"]="+members[i].name);
		}
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " + index);
	}

}