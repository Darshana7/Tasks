package com.te.prac;

public class MainSingleton {
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.helperMethod();
		System.out.println(obj1);
		SingletonClass obj2 = SingletonClass.helperMethod();
		System.out.println(obj2);
		SingletonClass obj3 = SingletonClass.helperMethod();
		System.out.println(obj3);
	}

}
