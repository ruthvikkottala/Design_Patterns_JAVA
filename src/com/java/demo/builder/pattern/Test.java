package com.java.demo.builder.pattern;

public class Test {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder()
				.fname("Test")
				.lname("Name")
				.age(25)
				.phone("9642396234")
				.build();
		System.out.println("User1 -->"+user1);
		
		User user2 = new User.UserBuilder()
				.fname("Test")
				.lname("Name")
				.age(25)
				.build();
		System.out.println("User2 -->"+user2);
	}

}
