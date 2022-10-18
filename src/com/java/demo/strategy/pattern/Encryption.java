package com.java.demo.strategy.pattern;

public interface Encryption {

	public void encrypt(String toBeEncrypted);
	
	public EncodingPatternEnum getEncryptionType();
}
