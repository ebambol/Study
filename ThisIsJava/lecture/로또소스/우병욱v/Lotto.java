package com.java.test1;

public class Lotto {

	public static void main(String[] args) {
		int b1,b2,a1,a2,a3,a4,a5,a6,i;
		cd: do {
			a1 = (int)(Math.random()*45)+1;
			a2 = (int)(Math.random()*45)+1;
			a3 = (int)(Math.random()*45)+1;
			a4 = (int)(Math.random()*45)+1;
			a5 = (int)(Math.random()*45)+1;
			a6 = (int)(Math.random()*45)+1;
			i=1;
			for(i=1;i<=6;i++) {
				for(int j=1;j<=6;j++) {
					if(i==1) {
						b1 = a1;
					}else if(i==2){
						b1 = a2;
					}else if(i==3){
						b1 = a3;
					}else if(i==4){
						b1 = a4;
					}else if(i==5){
						b1 = a5;
					}else{
						b1 = a6;
					}
					if(j==1) {
						b2 = a1;
					}else if(j==2){
						b2 = a2;
					}else if(j==3){
						b2 = a3;
					}else if(j==4){
						b2 = a4;
					}else if(j==5){
						b2 = a5;
					}else{
						b2 = a6;
					}
					if(j==i) {
					}else if (b1==b2) {
						continue cd;
					}else {
					}
				}
			}
			}while(i<=6);
		System.out.println(a1+","+a2+","+a3+","+a4+","+a5+","+a6);
	}	
}