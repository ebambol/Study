package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("ºòÀÚ¹Ù", "011225-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		Korean k2 = new Korean("±èÀÚ¹Ù", "932123-1231211");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
