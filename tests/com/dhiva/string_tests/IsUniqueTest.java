package com.dhiva.string_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.dhiva.strings.IsUnique;

public class IsUniqueTest {
	@Test
	public void test() {
		IsUnique obj = new IsUnique();
//		boolean expected = true;
		boolean actual = obj.isUnique("dhiva");
		assertEquals(true, actual);
	}
}
