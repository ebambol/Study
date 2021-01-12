package com.java.test1;

public class Lotto3 {

	public static void main(String[] args) {
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,i=1;
		do {
			int a = (int)(Math.random()*45)+1;
			if(i==1) {
				a1=a;
			}else if(i==2) {
				a2=a;
			}else if(i==3) {
				a3=a;
			}else if(i==4) {
				a4=a;
			}else if(i==5) {
				a5=a;
			}else {
				a6=a;
			}
			 switch(i) {
			 case 6:
				 i = (a5==a)? 0 : i;
			 case 5:
				 i = (a4==a)? 0 : i;
			 case 4:
				 i = (a3==a)? 0 : i;
			 case 3:
				 i = (a2==a)? 0 : i;
			 case 2:
				 i = (a1==a)? 0 : i;
			default:
				i++;
			 }
			}while(i<=6);
		System.out.println(a1+","+a2+","+a3+","+a4+","+a5+","+a6);
}	
}
