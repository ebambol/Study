package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1= "홍길동";
		String str2= null;
		
		System.out.println(Objects.requireNonNull(str1));	//홍길동
		
		try {
		System.out.println(Objects.requireNonNull(str2));	
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());	//null
		}

		try {
		System.out.println(Objects.requireNonNull(str2,"이름이 없습니다."));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());	//이름이 없습니다.
		}

		try {
		System.out.println(Objects.requireNonNull(str2,()->"이름이 없습니다."));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());	//이름이 없습니다.
		}
		
		System.out.println(Objects.isNull(str1));	//false
		System.out.println(Objects.isNull(str2));	//true
		
		System.out.println(Objects.nonNull(str1));	//true
		System.out.println(Objects.nonNull(str2));	//false
	}

}
