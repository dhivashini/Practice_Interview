package com.dhiva.trees_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.trees.*;

public class BtIsBstTest {
	@Test
	public void test() {
		TreeNode n1 = new TreeNode(100);
		n1.left = new TreeNode(20);
		n1.right = new TreeNode(500);
		n1.left.left = new TreeNode(10);
		n1.left.right = new TreeNode(110);
		BtIsBst obj = new BtIsBst();
		boolean output = obj.isBtBst(n1);
		boolean expected = false;
		assertEquals(expected, output);
	}


}