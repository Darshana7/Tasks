package com.te.prac;

public class SingletonClass {
	
	private static SingletonClass singleton;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass helperMethod( ) {
		if(singleton==null) {
			singleton = new SingletonClass();
			return singleton;
		}
		return singleton;
	}

}
