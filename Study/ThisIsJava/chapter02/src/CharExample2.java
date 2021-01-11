//2020-12-14 이것이자바다 p43 이현국
public class CharExample2 {
	public static void main (String[] args) {
		char c1 = 'A'; //문자를 직접 저장
		char c2 = 65; //10진수를 저장
		char c3 = '\u0041'; //16진수를 저장
		
		char c4 = '가'; //문자를 직접 저장
		char c5 = 44032; //10진수로 저장
		char c6 = '\uac00'; //16진수로 저장
		
		int uniCode = c4; //유니코드 받기 char -> int (promotion 강제 형변환)

		System.out.print(c4); //44032
		System.out.println(uniCode);
		c4++; // 44033 =>  각
		uniCode = c4;	//변수 = 변수
		System.out.print(c4);
		System.out.println(uniCode);
		c4++; // 44034 => 갂
		uniCode = c4;	//변수 = 변수
		System.out.print(c4);
		System.out.println(uniCode);
		//한글전체출력
		for(c4 = 44032; c4 <=55203; c4++)
			System.out.print(c4);
	}
}
/*
 * 에러코드
 * char -> chr 
 * chr cannot be resolved to a type
 * char c3 = \u0041;
 * A cannot be resolved to a variable
 * char c4 = '가나' / char c3 = '\0041'
 * Invalid character constant
 */
