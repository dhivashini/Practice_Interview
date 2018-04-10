package com.dhiva.trees_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.trees.HeightBalancedTree;
import com.dhiva.trees.TreeNode;

public class BalancedTreeTest {
	@Test
	public void test() {
		HeightBalancedTree obj = new HeightBalancedTree();
		boolean expected = true;
		TreeNode root1 = new TreeNode(26);
		root1.right = new TreeNode(3);
		root1.right.right = new TreeNode(3);
		root1.left = new TreeNode(10);
		root1.left.left = new TreeNode(4);
		root1.left.left.right = new TreeNode(30);
		root1.left.right = new TreeNode(6);
		boolean output = obj.isBalanced(root1);
		assertEquals(expected, output);
	}
}
