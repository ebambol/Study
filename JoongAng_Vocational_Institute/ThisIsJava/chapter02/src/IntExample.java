//2020-12-14 이것이 자바다 p45 이현국
public class IntExample {
	public static void main (String[] args) {
		int var1 = 10;	//10진수로 저장
		int var2 = 012;	//8진수로 저장
		int var3 = 0x10; //16진수로 저장

		System.out.println(var1);	//10
		System.out.println(var2);	//10
		System.out.println(var3);	//10

		int [] var = {10, 012, 0x10};
		System.out.println("반복문");
		for (int i=0; i<3; i++)
			System.out.println(var[i]);
	}
}



 
 /* 에러코드
  *  var3 = 0xG
 * Invalid hex literal number*/
 