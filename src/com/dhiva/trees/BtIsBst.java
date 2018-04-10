package com.dhiva.trees;

public class BtIsBst {
	public boolean isBtBst(TreeNode root) {
		if (root == null)
			return true;
		return isBtBstUtil(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private boolean isBtBstUtil(TreeNode root, int maxValue, int minValue) {
		if (root == null)
			return true;
		if (root.data <=  minValue || root.data >= maxValue)
			return false;
		return (isBtBstUtil(root.left, root.data, minValue) 
				&& isBtBstUtil(root.right, maxValue, root.data));
	
	}
}
