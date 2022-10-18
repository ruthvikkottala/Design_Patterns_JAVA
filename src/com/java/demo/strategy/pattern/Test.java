package com.java.demo.strategy.pattern;

public class Test {

	public static void main(String[] args) {
		
		EncryptionFactory factory = new EncryptionFactory();
		factory.getEncryptionType(EncodingPatternEnum.SHA1).encrypt("TEST");
		
		factory.getEncryptionType(EncodingPatternEnum.MD5).encrypt("TEST");
	}
}
