package com.dhiva.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
	public Node removeDups(Node head) {
		if (head == null) {
			return null;
		}
		HashSet<Integer> set = new HashSet<>();
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (!set.contains(temp.value)) {
				set.add(temp.value);
			} else {
				prev.next = temp.next;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
}
