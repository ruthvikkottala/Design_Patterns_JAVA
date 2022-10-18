package com.java.demo.singleton.pattern;

public class LazyInnerClassSingleton {

	private LazyInnerClassSingleton () {}
	
	private static class SingletonHelper {
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
	}
	
	public static LazyInnerClassSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
