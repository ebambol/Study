package com.java.test;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
//		array.length =3
//		array[0].lenght=2, array[1].lenght=3, array[2].lenght=5
		int arrayAll=0;
		
		for(int i=0; i<array.length; i++) {
			arrayAll+=array[i].length;
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
			}
		}
		avg = (double)sum/arrayAll;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
