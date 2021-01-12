//2020-12-14 이것이 자바다 p43
package sec02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
//		char[] c = {'A', 65, '\u0041', '가', 44032, '\uac00'};  
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		int uniCode = c1;


			
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);

//		for (int i =0; i<6; i++)
//			System.out.println(c[i]);
	}

}
/*
A
A
A
가
가
가
65
*/