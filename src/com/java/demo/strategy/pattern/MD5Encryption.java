package com.java.demo.strategy.pattern;

public class MD5Encryption implements Encryption{

	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("Encrytion using MD5 method");
		
	}

	@Override
	public EncodingPatternEnum getEncryptionType() {
		return EncodingPatternEnum.MD5;
	}

}
