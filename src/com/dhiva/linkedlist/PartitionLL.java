package com.dhiva.linkedlist;

public class PartitionLL {
	public Node partitionLL(Node head, int k) {
		if (head == null)
			return null;
		Node temp = head;
		Node beforeStart = null, beforeEnd = null, afterStart = null, afterEnd = null;
		while (temp != null) {
			Node next = temp.next;
			temp.next = null;
			if (temp.value < k) {
				if (beforeStart == null) {
					beforeStart = temp;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = temp;
					beforeEnd = temp;
				}

			} else {
				if (afterStart == null) {
					afterStart = temp;
					afterEnd = afterStart;
				} else {
					afterEnd.next = temp;
					afterEnd = temp;
				}
			}
			temp = next;
		}
		if (beforeStart == null)
			return afterStart;

		beforeEnd.next = afterStart;

		return beforeStart;
	}
}
