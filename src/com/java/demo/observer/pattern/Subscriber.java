package com.java.demo.observer.pattern;

public class Subscriber implements Observer {

	private String name;
	private Channel channel;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {

		System.out.println("Hey" + name + ",Video uploaded to" + channel.getTitle());
	}

	public void subbedTo(Channel ch) {
		this.channel = ch;
	}
}
