package com.java.lotto;
//45�� ���� �� 6���� ���ڸ� �ߺ����� �߻����� ���.
//�迭�� �̿��Ͽ� �ۼ�.
public class LottoArrayProject {
	public static void main(String[] args) {
		
		int[] arrLnum = new int[6];
		
		System.out.print("���� ��ȣ��?!! ");
		
		for(int i = 0; i<arrLnum.length; i++) {
			int Lnum = (int)(Math.random()*45)+1;
			arrLnum[i] = Lnum;
			
			System.out.print(arrLnum[i] + " " );
			
			for(int j = 0; j<i; j++) {		//�񱳸� �ּ�ȭ �ϱ� ���� ���ǽĿ� i��ŭ ��.
			if(arrLnum[i]==arrLnum[j]) {
				System.out.println();
				System.out.println("arrLnum["+(i)+"]��°�� arrLnum["+(j)+"]��°�� ���� ����.");
				arrLnum[i]=(int)(Math.random()*45)+1;
				System.out.print(arrLnum[i]+"���� ���� �� ");
				System.out.print("arrLnum["+(i)+"]��°���� : "+arrLnum[i]);
				System.out.println();
				j--;						//���� �� �ٽ� �񱳸� ���� ���ҿ����� ���
				}
			}
		}
		System.out.println();
		System.out.print("���� ��ȣ��?!! ");
		for(int i = 0; i<arrLnum.length; i++) {
			System.out.print(arrLnum[i] + " " );
		}
	}
}
