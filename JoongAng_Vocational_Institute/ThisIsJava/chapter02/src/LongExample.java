//2020-12-15 이것이 자바다 p46 이현국
public class LongExample {
	public static void main (String[] args) {
		long [] var = {10, 20L, 1000000000000L};
		long var1 = 10;		// int => long 자동형변환 (promotion)
		long var2 = 20L;	//long
//		long var3 = 1000000000000;	//The literal 1000000000000 of type int is out of range (컴파일 에러)
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		System.out.println("------------------------");
		for(int i=0; i<3; i++)
			System.out.println(var[i]);
	}
}
