
public class IfExample{
	public static void main(String[] args) {
		/*
		 * 100 ~ 90 이면 'A'등급
		 * 89 ~ 80 이면 'B'등급
		 * 79 ~ 70 이면 'C'등급
		 * 69 ~ 60 이면 'D'등급
		 * 69 미만이면 'F'등급
		 * 점수가 0 ~ 100 사이 값이 아니면 입력값 오류
		 */
		
		int score = 98;
		int value = (int)score / 10;
		String result = null;	//2.
		
		//1. 중첩 if
		if(score >= 0) {
			if(score <= 100) {
				if(value >= 9) {
					System.out.println("1.등급 : A");
				}
				if(value == 8) {
					System.out.println("1.등급 : B");
				}
				if(value == 7) {
					System.out.println("1.등급 : C");
				}
				if(value == 6) {
					System.out.println("1.등급 : D");
				}
				if(value <= 5){
					System.out.println("1.등급 : F");
				}
			}
		}
		
		if(score < 0) {
			System.out.println("1.입력값 오류");
		}
		if(score > 100) {
			System.out.println("1.입력값 오류");
		}
		
		
		//2. 삼항 연산자
		if(value >= 9) {
			result = (score > 100) ? "입력값 오류" : "등급 : A";
		}
		if(value == 8) {
			result = "등급 : B";
		}
		if(value == 7) {
			result = "등급 : C";
		}
		if(value == 6) {
			result ="등급 : D";
		}
		if(value <= 5){
			result = (score < 0) ? "입력값 오류" : "등급 : F";
		}
		
		System.out.println("2." + result);

		
		//3. return
		if(score < 0) {
			System.out.println("3.입력값 오류");
			return;
		}
		if(score > 100) {
			System.out.println("3.입력값 오류");
			return;
		}
		if(value >= 9) {
			System.out.println("3.등급 : A");
		}
		if(value == 8) {
			System.out.println("3.등급 : B");
		}
		if(value == 7) {
			System.out.println("3.등급 : C");
		}
		if(value == 6) {
			System.out.println("3.등급 : D");
		}
		if(value <= 5){
			System.out.println("3.등급 : F");
		}
	}
}