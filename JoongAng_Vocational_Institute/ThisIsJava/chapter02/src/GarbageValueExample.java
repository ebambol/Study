//2020-12-11 이것이 자바다 p41 이현국
public class GarbageValueExample {
	public static void main (String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
