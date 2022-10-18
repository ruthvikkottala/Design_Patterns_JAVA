package com.java.demo.strategy.pattern;

public class SHA1Encryption implements Encryption{

	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("Encrytion using SHA1 method");
		
	}

	@Override
	public EncodingPatternEnum getEncryptionType() {
		
		return EncodingPatternEnum.SHA1;
	}

}
