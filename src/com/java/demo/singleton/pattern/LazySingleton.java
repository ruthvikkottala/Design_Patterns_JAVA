package com.java.demo.singleton.pattern;

public class LazySingleton {

	private LazySingleton( ) {}
	
	private static LazySingleton instance;
	
	public static synchronized LazySingleton getInstance() {
		return instance==null ? instance = new LazySingleton() : instance;
	}
}
