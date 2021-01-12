package com.java.lotto;
//45개 숫자 중 6개의 숫자를 중복없이 발생시켜 출력.
//배열을 이용하여 작성.
public class LottoArrayProject {
	public static void main(String[] args) {
		
		int[] arrLnum = new int[6];
		
		System.out.print("기존 번호는?!! ");
		
		for(int i = 0; i<arrLnum.length; i++) {
			int Lnum = (int)(Math.random()*45)+1;
			arrLnum[i] = Lnum;
			
			System.out.print(arrLnum[i] + " " );
			
			for(int j = 0; j<i; j++) {		//비교를 최소화 하기 위해 조건식에 i만큼 비교.
			if(arrLnum[i]==arrLnum[j]) {
				System.out.println();
				System.out.println("arrLnum["+(i)+"]번째와 arrLnum["+(j)+"]번째의 값이 같음.");
				arrLnum[i]=(int)(Math.random()*45)+1;
				System.out.print(arrLnum[i]+"으로 변경 후 ");
				System.out.print("arrLnum["+(i)+"]번째값은 : "+arrLnum[i]);
				System.out.println();
				j--;						//변경 후 다시 비교를 위한 감소연산자 사용
				}
			}
		}
		System.out.println();
		System.out.print("변경 번호는?!! ");
		for(int i = 0; i<arrLnum.length; i++) {
			System.out.print(arrLnum[i] + " " );
		}
	}
}
