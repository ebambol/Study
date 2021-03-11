package com.java.test6;

import java.util.Arrays;

public class EqualsExample2 {

	public static void main(String[] args) {
		int[][] original = { {1,2}, {3,4} };
		
		//얕은 복제후 비교
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: "+original.equals(cloned1));	//false
		System.out.println("1차 배열 항목 값 비교: "+Arrays.equals(original, cloned1));	//true
		System.out.println("중첩 배열 항목 값 비교: "+Arrays.deepEquals(original, cloned1));	//true
		
		//깊은 복제후 비교
		System.out.println("[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);	//얕은복제
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);	//깊은복제
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);	//깊은복제
		System.out.println("배열 번지 비교: "+original.equals(cloned2));	//false
		System.out.println("1차 배열 항목 값 비교: "+Arrays.equals(original, cloned2));	//false
		System.out.println("중첩 배열 항목 값 비교: "+Arrays.deepEquals(original, cloned2));	//true
	}
}
