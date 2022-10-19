package com.java.demo.builder.pattern;

public class User {

	private final String fname;
	private final String lname;
	private final int age;
	private final String phone;
	private final String address;

	public User(UserBuilder userBuilder) {
		this.fname = userBuilder.fname;
		this.lname = userBuilder.lname;
		this.age = userBuilder.age;
		this.phone = userBuilder.phone;
		this.address = userBuilder.address;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", age=" + age + ", phone=" + phone + ", address="
				+ address + "]";
	}

	// Getter only No setters in order to maintain immutable nature
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public static class UserBuilder {
		private String fname;
		private String lname;
		private int age;
		private String phone;
		private String address;
		
		public UserBuilder() {}

		public UserBuilder fname(String fname) {
			this.fname = fname;
			return this;
		}

		public UserBuilder lname(String lname) {
			this.lname = lname;
			return this;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}
	}

}
