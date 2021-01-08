//2020-12-15 이것이 자바다 p49 이현국
public class BooleanExample {
	public static void main (String[] args) {
		boolean stop = true;	//true, false 
			//True, False cannot be resolved to a varable
			//1,0 Type mismatch: cannot convert from int to boolean 

//		System.out.println("stop 변수의 값은 : "+ stop + " 입니다.");
		if (stop) {
			System.out.println("중지합니다.");
		}
		else {
			System.out.println("시작합니다.");
		}
	}
}
