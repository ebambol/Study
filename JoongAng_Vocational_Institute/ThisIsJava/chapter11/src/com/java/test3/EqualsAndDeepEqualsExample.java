package com.java.test3;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = new Integer(1000);
		Integer o2 = 1000;
		
		System.out.println(Objects.equals(o1, o2));				//true
		System.out.println(Objects.equals(o1, null));			//false
		System.out.println(Objects.equals(null, o2));			//false
		System.out.println(Objects.equals(null, null));			//true
		System.out.println(Objects.deepEquals(o1,o2)+ "\n");	//true
		
		Integer[] arr1 = { new Integer(1), new Integer(2) };
		Integer[] arr2 = { 1, 2 };	//autoboxing
		System.out.println(Objects.equals(arr1, arr2));			//false (배열요소 비교불가)
		System.out.println(Objects.deepEquals(arr1, arr2));		//true
		System.out.println(Arrays.deepEquals(arr1, arr2));		//true
		System.out.println(Objects.deepEquals(null, arr2));		//false
		System.out.println(Objects.deepEquals(arr1, null));		//false
		System.out.println(Objects.deepEquals(null, null));		//true
	}

}
