package com.java.demo.strategy.pattern;

public class SHA2Encryption implements Encryption{

	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("Encrytion using SHA2 method");
		
	}

	@Override
	public EncodingPatternEnum getEncryptionType() {
		
		return EncodingPatternEnum.SHA2;
	}

}

