package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		//대입시 자동 언박싱
		int value = obj;
		System.out.println(value);
		
		//연산시 자동 언박싱
		int result = obj+100;
		System.out.println(result);
	}

}
