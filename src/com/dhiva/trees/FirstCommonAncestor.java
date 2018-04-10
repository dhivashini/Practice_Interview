package com.dhiva.trees;

public class FirstCommonAncestor {
	boolean f1 = false, f2 = false;

	public TreeNode commonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {

		TreeNode FCA = commonAncestorUtil(root, n1, n2);
		if (f1 && f2)
			return FCA;
		return null;
	}

	public TreeNode commonAncestorUtil(TreeNode root, TreeNode n1, TreeNode n2) {
		if (root == null)
			return null;
		if (root.data == n1.data) {
			f1 = true;
			return n1;
		}

		if (root.data == n2.data) {
			f2 = true;
			return n2;
		}
		TreeNode left = commonAncestorUtil(root.left, n1, n2);
		TreeNode right = commonAncestorUtil(root.right, n1, n2);
		if (left != null && right != null)
			return root;
		return (left != null) ? left : right;

	}
}
