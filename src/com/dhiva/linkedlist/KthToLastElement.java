package com.dhiva.linkedlist;

public class KthToLastElement {
	public int getKToLastElement(Node n, int k) {
		if (n == null)
			return -1;
		Node fast = n, slow = n;
		for (int i = 1; i <= k-1; i++) {
			fast = fast.next;
		}
		if(fast == null)
			return -1;
		while(fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.value;
	}
}
