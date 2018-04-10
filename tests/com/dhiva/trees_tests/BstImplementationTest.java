package com.dhiva.trees_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.trees.BstImplementation;
import com.dhiva.trees.TreeNode;

public class BstImplementationTest {
//	@Test
//	public void test() {
//		TreeNode n1 = new TreeNode(100);
//		n1.left = new TreeNode(20);
//		n1.right = new TreeNode(500);
//		n1.left.left = new TreeNode(10);
//		n1.left.right = new TreeNode(110);
//		BstImplementation obj = new BstImplementation();
//		boolean output = obj.searchNode(30, n1);
//		boolean expected = false;
//		assertEquals(expected, output);
//	}
//	
//	@Test
//	public void test1() {
//		BstImplementation obj = new BstImplementation();
//		obj.insertNode(10);
//		obj.insertNode(20);
//		obj.insertNode(30);
//		obj.insertNode(5);
//		obj.insertNode(7);
//		obj.insertNode(100);
//		TreeNode root = obj.getRoot();
//		TreeTraversals obj1 = new TreeTraversals();
//		obj1.preorder(root);
//	}

	@Test
	public void test2() {
		BstImplementation obj = new BstImplementation();
		obj.insertNode(10);
		obj.insertNode(20);
		obj.insertNode(30);
		obj.insertNode(5);
		obj.insertNode(3);
		obj.insertNode(7);
		obj.insertNode(100);
		obj.deleteNode(10);
		TreeNode root = obj.getRoot();
		TreeTraversals obj1 = new TreeTraversals();
		obj1.levelorder(root);
	}

}
