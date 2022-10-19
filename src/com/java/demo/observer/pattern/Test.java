package com.java.demo.observer.pattern;

public class Test {
	public static void main(String[] args) {
		Channel ch = new Channel();
		
		Subscriber s1 = new Subscriber("Test1");
		Subscriber s2 = new Subscriber("Test2");
		Subscriber s3 = new Subscriber("Test3");
		Subscriber s4 = new Subscriber("Test4");
		
		ch.Subscribe(s1);
		ch.Subscribe(s2);
		ch.Subscribe(s3);
		ch.Subscribe(s4);
		
		s1.subbedTo(ch);
		s2.subbedTo(ch);
		s3.subbedTo(ch);
		s4.subbedTo(ch);
		
		ch.UnSubscribe(s3);
		ch.upload("Test video");
	}
}
