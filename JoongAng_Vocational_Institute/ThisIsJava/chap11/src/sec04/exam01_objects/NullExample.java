package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1= "ȫ�浿";
		String str2= null;
		
		System.out.println(Objects.requireNonNull(str1));	//ȫ�浿
		
		try {
		System.out.println(Objects.requireNonNull(str2));	
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());	//null
		}

		try {
		System.out.println(Objects.requireNonNull(str2,"�̸��� �����ϴ�."));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());	//�̸��� �����ϴ�.
		}

		try {
		System.out.println(Objects.requireNonNull(str2,()->"�̸��� �����ϴ�."));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());	//�̸��� �����ϴ�.
		}
		
		System.out.println(Objects.isNull(str1));	//false
		System.out.println(Objects.isNull(str2));	//true
		
		System.out.println(Objects.nonNull(str1));	//true
		System.out.println(Objects.nonNull(str2));	//false
	}

}