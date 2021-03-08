package com.java.test5;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "æ»≥Á«œººø‰";
//		String str = "abcde";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);	//bytes1.length : 10
		for(int i=0; i<bytes1.length; i++) {
			System.out.println("bytes1["+i+"]= " + bytes1[i]);	
			/*bytes1[0]= -66 bytes1[1]= -56 bytes1[2]= -77 bytes1[3]= -25
					bytes1[4]= -57 bytes1[5]= -49 bytes1[6]= -68
					bytes1[7]= -68 bytes1[8]= -65 bytes1[9]= -28 */
		}
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);	//bytes1 -> String : æ»≥Á«œººø‰
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("(EUC-KR)bytes2.length : " + bytes2.length);
			//(EUC-KR)bytes2.length : 10
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("(EUC-KR)bytes2 -> (EUC-KR)String : " + str2);
			//(EUC-KR)bytes2 -> (EUC-KR)String : æ»≥Á«œººø‰
			String str3 = new String(bytes2, "UTF-8");
			System.out.println("(EUC-KR)bytes2 -> (UTF-8)String : " + str2);
			//(EUC-KR)bytes2 -> (UTF-8)String : æ»≥Á«œººø‰
			System.out.println();
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("(UTF-8)bytes3.length : " + bytes3.length);
			//(UTF-8)bytes3.length : 15
			String str4 = new String(bytes3, "UTF-8");
			System.out.println("(UTF-8)bytes3 -> (UTF-8)String : " + str4);
			//(UTF-8)bytes3 -> (UTF-8)String : æ»≥Á«œººø‰
			String str5 = new String(bytes3, "EUC-KR");
			System.out.println("(UTF-8)bytes3 -> (EUC-KR)String : " + str5);
			//(UTF-8)bytes3 -> (EUC-KR)String : ???????∏Ï??
		} catch (UnsupportedEncodingException e ) {
			e.printStackTrace();
		}
	}

}
