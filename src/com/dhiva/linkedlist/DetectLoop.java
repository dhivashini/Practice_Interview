package com.dhiva.linkedlist;

public class DetectLoop {
	public boolean hasLoop(Node head) {
		Node fast = head, slow = head;
		while (fast != null && fast.next != null && fast.next != slow) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast.next == slow)
			return true;
		return false;

	}
}
