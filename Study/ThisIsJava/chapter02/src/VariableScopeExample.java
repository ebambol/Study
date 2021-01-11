//2020-12-11 이것이 자바다 p37 이현국
public class VariableScopeExample {
	public static void main (String[] args) {
		//v1변수는  main 메소드 블록에 선언
		//if변수는 블록의 외부에 선언
		int v1 = 15;
		int v2 = 0;
		/*
		 * 정수 : byte:1, char:2, short:2, int:4, long:8
		 * 실수 : float:4, double:8
		 * 논리 : boolean:1
		 */


		if (v1 > 10) { //15 > 10 => true
			//v2 변수는 if블록에 선언 =>
			// if 블록 내에서 사용하는 지역변수
			v2 = v1 - 10; //15 - 10 => 5;
			// v2 = 5;
		}

		int v3 = v1 + v2 + 5;
	}
}
