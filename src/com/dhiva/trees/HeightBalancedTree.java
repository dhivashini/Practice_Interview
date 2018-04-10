package com.dhiva.trees;

public class HeightBalancedTree {
	public boolean isBalanced(TreeNode root) {
		int val = isBalancedutil(root);
		if (val == -1)
			return false;
		return true;
	}

	private int isBalancedutil(TreeNode root) {
		if (root == null)
			return 0;
		int left = isBalancedutil(root.left);
		if(left == -1)
			return -1;
		int right = isBalancedutil(root.right);
		if(right == -1)
			return -1;
		if (Math.abs(left - right) > 1)
			return -1;
		else
			return Math.max(left, right) + 1;
	}
}
