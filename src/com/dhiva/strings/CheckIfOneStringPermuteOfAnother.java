package com.dhiva.strings;

import java.util.Arrays;

public class CheckIfOneStringPermuteOfAnother {
	public boolean checkPermute(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		return sortChar(s1).equals(sortChar(s2));
	}

	public String sortChar(String s) {
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
}
