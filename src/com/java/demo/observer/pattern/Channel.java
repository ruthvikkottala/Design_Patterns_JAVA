package com.java.demo.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> subs;
	private String title;

	public Channel() {
		subs = new ArrayList<>();
	}

	@Override
	public void Subscribe(Subscriber sub) {
		subs.add(sub);
	}

	@Override
	public void UnSubscribe(Observer sub) {
		subs.remove(sub);
	}

	@Override
	public void notifySubs() {
		for (Observer sub : subs) {
			sub.update();
		}
	}

	public void upload(String title) {
		this.title = title;
		notifySubs();
	}

	public String getTitle() {
		return title;
	}
}
