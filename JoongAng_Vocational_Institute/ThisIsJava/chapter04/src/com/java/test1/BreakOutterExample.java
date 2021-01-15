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
			}	//break Out	for(lower)Å»Ãâ
		}	//break Outter	for(upper)Å»Ãâ
	System.out.println("ÇÁ·Î±×·¥ Á¾·á");
	}

}
