package com.java.lotto;

public class Lotto {
//6�� ���� �ߺ����� �迭�� ����Ͽ� �ۼ�
	
	public static void main(String[] args) {
		int[] a= new int[6];
		cd: for(int z = 0;z<a.length;z++) {	//0~5
			a[z]= (int)(Math.random()*45)+1;
			 for(int i=z-1;i>=0;i--) {
					if(a[z]==a[i]) {
						z--;
						continue cd;
				}
			}
			 System.out.print(a[z]+",");
		}
	}
}

