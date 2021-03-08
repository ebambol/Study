package com.java.test4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.java.test4.Car");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());	//클래스 이름
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor[] construtors = clazz.getDeclaredConstructors();
		for(Constructor constructor : construtors) {
			System.out.print(constructor.getName()+"(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
	}	//end of main
	
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());	//java.lang.String
//			System.out.print(parameters[i].getSimpleName());	//String
			if(i<(parameters.length-1)) {
				System.out.print(", ");
			}
		}
	}
}
