//2020-12-14 이것이 자바다 p41
package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {

		byte var1 = 125;
		int var2 = 125;
		
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + '\t' + "var2: " + var2);
			
		}

	}
}
/* 결과값
var1: 126	var2: 126
var1: 127	var2: 127
var1: -128	var2: 128
var1: -127	var2: 129
var1: -126	var2: 130
*/