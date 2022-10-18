package com.java.demo.singleton.pattern;

public class Test {
	public static void main(String[] args) {
		
		//Eager singleton
		EagerSingleton Object1 = EagerSingleton.getInstance();
		System.out.println("EagerObject1 ->"+Object1.hashCode());
		
		EagerSingleton Object2 = EagerSingleton.getInstance();
		System.out.println("EagerObject2 ->"+Object2.hashCode());
		
		// LazySingleton
		
		LazySingleton obj1 = LazySingleton.getInstance();
		System.out.println("LazyObject1 ->"+obj1.hashCode());
		
		LazySingleton obj2 = LazySingleton.getInstance();
		System.out.println("LazyObject2 ->"+obj2.hashCode());
		
		//LazyInnerClassSingleton
		
		LazyInnerClassSingleton Obj1 = LazyInnerClassSingleton.getInstance();
		System.out.println("LazyInnerClassSingletonObject1 ->"+Obj1.hashCode());
		
		LazyInnerClassSingleton Obj2 = LazyInnerClassSingleton.getInstance();
		System.out.println("LazyInnerClassSingletonObject2 ->"+Obj2.hashCode());
	}
}
