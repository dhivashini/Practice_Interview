package com.dhiva.trees_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.trees.FirstCommonAncestor;
import com.dhiva.trees.HeightBalancedTree;
import com.dhiva.trees.TreeNode;

public class FirstCommonAncestorTest {
	@Test
	public void test() {
		FirstCommonAncestor obj = new FirstCommonAncestor();
		boolean expected = true;
		TreeNode root1 = new TreeNode(26);
		root1.right = new TreeNode(3);
		root1.right.right = new TreeNode(31);
		root1.left = new TreeNode(10);
		root1.left.left = new TreeNode(4);
		root1.left.left.right = new TreeNode(30);
		root1.left.right = new TreeNode(6);
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(6);
		TreeNode output = obj.commonAncestor(root1, n1, n2);
		assertEquals(root1.data, output.data);
	}
}
