//2020-12-14 이것이자바다 p43 이현국
public class CharExample3 {
	public static void main (String[] args) {
		char c1 = 'A'; //문자를 직접 저장
		char c2 = 65; //10진수를 저장
		char c3 = '\u0041'; //16진수를 저장
		
		char c4 = '가'; //문자를 직접 저장
		char c5 = 44032; //10진수로 저장
		char c6 = '\uac00'; //16진수로 저장
		
		int uniCode = c1; //유니코드 받기 char -> int (promotion 강제 형변환)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
		//영어 전체출력
		for (c1 = 65; c1 <= 90; c1++)
			System.out.print(c1);
	}
}
/*
 * 에러코드
 * char -> chr 
 * chr cannot be resolved to a type
 * 
 * char c1 = "A"
 * Type mismatch: cannot convert from String to char
 * 
 * char c3 = \u0041;
 * A cannot be resolved to a variable
 * 
 * char c4 = '가나' / char c3 = '\0041'
 * Invalid character constant
 */
