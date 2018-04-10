package com.dhiva.strings;

public class IsUnique {
	public boolean isUnique(String s1) {
		boolean[] count = new boolean[256];
		for (int i = 0; i < s1.length(); i++) {
			if (count[s1.charAt(i)])
				return false;
			count[s1.charAt(i)] = true;
		}
		return true;
	}
}
