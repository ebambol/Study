//2020-12-14 이것이 자바다 p54
package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;

		if((i < Byte.MIN_VALUE) || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 나타낼 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		}
		else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}

}
/*
byte 타입으로 나타낼 수 없습니다.
값을 다시 확인해 주세요.
*/