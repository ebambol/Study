package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length;i++) {
			System.out.println("scores["+i+"]= "+scores[i]);
		}
		System.out.println();
		
		String[] names = {"ȫ�浿","�ڵ���", "��μ�"};
		Arrays.sort(names);
		for(int i=0;i<names.length;i++) {
			System.out.println("names["+i+"]= "+names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] member = {m1,m2,m3};
		Arrays.sort(member);
		for(int i=0; i<member.length; i++) {
			System.out.println("member["+i+"].name= "+ member[i].name);
		}
	}

}
