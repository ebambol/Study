package chap06.korean;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("ºòÀÚ¹Ù", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : "+k1.ssn);

		Korean k2 = new Korean("±èÀÚ¹Ù", "951101-7456321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : "+k2.ssn);
	}

}
