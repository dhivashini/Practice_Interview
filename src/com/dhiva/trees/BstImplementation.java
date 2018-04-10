package com.dhiva.trees;

public class BstImplementation {
	public TreeNode root;

	public BstImplementation() {
		this.root = null;
	}

	public TreeNode getRoot() {
		return root;
	}

	public boolean searchNode(int value, TreeNode root) {
		return searchNodeUtil(value, root);
	}

	private boolean searchNodeUtil(int value, TreeNode root) {
		if (root == null)
			return false;
		if (root.data == value)
			return true;
		return searchNodeUtil(value, root.left) || searchNodeUtil(value, root.right);
	}

	public void insertNode(int value) {
		root = insertNodeUtil(value, root);
	}

	private TreeNode insertNodeUtil(int value, TreeNode root) {
		if (root == null) {
			TreeNode temp = new TreeNode(value);
			return temp;
		}
		if (root.data < value) {
			root.right = insertNodeUtil(value, root.right);
		}
		if (root.data > value) {
			root.left = insertNodeUtil(value, root.left);
		}
		return root;
	}

	public void deleteNode(int value) {
		root = deleteNodeUtil(value, root);
	}

	private TreeNode deleteNodeUtil(int value, TreeNode root) {
		if (root == null)
			return root;
		if (root.data < value) {
			root.right = deleteNodeUtil(value, root.right);
		}
		if (root.data > value) {
			root.left = deleteNodeUtil(value, root.left);
		} else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;
			TreeNode succ = findSuccessor(root.right);
			int val = succ.data;
			root.data = val;
			root.right = deleteNodeUtil(val, root.right);

		}

		return root;
	}

	private TreeNode findSuccessor(TreeNode root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

}
