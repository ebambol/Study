package com.java.test1;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter : for (char upper='A'; upper<='Z'; upper++) {
			Out : for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
//					break Out;
				}
			}	//break Out	for(lower)Ż��
		}	//break Outter	for(upper)Ż��
	System.out.println("���α׷� ����");
	}

}
