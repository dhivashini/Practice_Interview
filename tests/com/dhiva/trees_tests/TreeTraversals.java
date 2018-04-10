package com.dhiva.trees_tests;

import java.util.LinkedList;
import java.util.Queue;

import com.dhiva.trees.TreeNode;

public class TreeTraversals {
	public void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public void preorder(TreeNode root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	public void postorder(TreeNode root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	
	public void levelorder(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode curr = queue.poll();
			System.out.println(curr.data);
			if(curr.left!=null) {
				queue.add(curr.left);
			}
			if(curr.right!=null) {
				queue.add(curr.right);
			}
		}
	}
}
