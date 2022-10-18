package com.java.demo.strategy.pattern;

import java.util.HashMap;
import java.util.Map;

public class EncryptionFactory {

	Map<EncodingPatternEnum, Encryption> map;
	
	public EncryptionFactory() {
		map = new HashMap<EncodingPatternEnum, Encryption>();
		map.put(EncodingPatternEnum.MD5, new MD5Encryption());
		map.put(EncodingPatternEnum.SHA1, new SHA1Encryption());
		map.put(EncodingPatternEnum.SHA2, new SHA2Encryption());
	}
	
	public Encryption getEncryptionType(EncodingPatternEnum enumv) {
		return map.containsKey(enumv) ? map.get(enumv) : map.get(EncodingPatternEnum.MD5);
	}
}
