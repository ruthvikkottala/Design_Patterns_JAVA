package com.java.demo.observer.pattern;

public interface Subject {

	void Subscribe(Subscriber sub);

	void UnSubscribe(Observer sub);

	void notifySubs();

}