package com.dhiva.strings;

public class StringRotation {
	public boolean isStringRotation(String s1, String s2) {
		String s3 = s1+s1;
		return s3.contains(s2);
	}
}
