package com.java.test4;

public class NewInstanceExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("com.java.test4.SendAction");
			//			Class clazz = Class.forName("com.java.test4.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
