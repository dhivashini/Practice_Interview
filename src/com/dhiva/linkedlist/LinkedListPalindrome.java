package com.dhiva.linkedlist;

public class LinkedListPalindrome {
	public boolean isPalindrome(Node head) {
		if(head == null || head.next==null)
			return true;
		Node fast = head, slow = head, secHead = null;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}

		secHead = slow.next;
		slow.next = null;

		ReverseLL obj = new ReverseLL();
		Node revHead = obj.reverseList(secHead);
		Node tempHead = head;

		while (tempHead.next != slow) {
			if (tempHead.value == revHead.value) {
				tempHead = tempHead.next;
				revHead = revHead.next;
			} else {
				return false;
			}
		}

		Node origSecHalf = obj.reverseList(revHead);
		slow.next = origSecHalf;
		return true;
	}
}
