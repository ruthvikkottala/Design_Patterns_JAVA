package com.java.demo.singleton.pattern;

public class EagerSingleton {

	private EagerSingleton() {
	}

	private static final EagerSingleton instance = new EagerSingleton();

	public static EagerSingleton getInstance() {
		return instance;
	}
}
