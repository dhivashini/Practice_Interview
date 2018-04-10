package com.dhiva.string_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.dhiva.strings.*;

public class CheckIfOnestringIsPermuteOfAnotherTest {
	@Test
	public void test() {
		CheckIfOneStringPermuteOfAnother obj = new CheckIfOneStringPermuteOfAnother();
//		boolean expected = true;
		boolean actual = obj.checkPermute("dog", "god");
		assertEquals(true, actual);
	}
}

