package org.ie.utils;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class MD5 {
	
	public static String md5(byte[] input) {
		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
			algorithm.update(input, 0, input.length);
			return new BigInteger(1, algorithm.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String md5(ByteBuffer buffer) {
		byte[] payload = new byte[buffer.remaining()];
		buffer.get(payload);
		return md5(payload);
	}

}
