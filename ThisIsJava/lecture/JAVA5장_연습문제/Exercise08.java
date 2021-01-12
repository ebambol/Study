package com.java.test;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		System.out.println("array.length: "+array.length);  //3
		System.out.println("array[0].length: "+array[0].length); //2
		System.out.println("array[1].length: "+array[1].length); //3
		System.out.println("array[2].length: "+array[2].length); //5
		
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length; j++) {
				sum = sum + array[i][j];
				count++;
			}
		}
		avg = (double)sum/count;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);

	}

}
