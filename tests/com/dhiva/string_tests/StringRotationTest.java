package com.dhiva.string_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.dhiva.strings.StringRotation;

public class StringRotationTest {
	@Test
	public void test() {
		StringRotation obj = new StringRotation();
		boolean expected = true;
		String s1 = "hello";
		String s2 = "llohe";
		boolean actual = obj.isStringRotation(s1, s2);
		assertEquals(expected, actual);
	}
}
