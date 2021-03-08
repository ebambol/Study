package com.java.test5;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };	//Hello Java
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String (bytes, 6, 4);
		System.out.println(str2);
//		String str4 = new String (bytes, 2342346);	//¥B¥V¥b¥b¥e¤u¥DÂÄ¥lÂÄ
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: str3 cannot be resolved to a variable

		try {
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12
		String str3 = new String (bytes, 6, 2342346);
		System.out.println(str3);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("¹®ÀÚ°¡ ³Ñ¾î°¬À½");
		}
	}

}
