package com.dhiva.linkedlist;

public class LinkedList {
	Node head = null;
	Node curr = null;

	public void insertNode(int value) {

		if (curr == null) {
			Node n = new Node(value);
			curr = n;
			head = n;
		} else {
			curr.next = new Node(value);
			curr = curr.next;
		}

	}

	public boolean deleteNode(int value) {

		if (head == null) {
			return false;
		} else {
			Node temp = head;
			if (temp.value == value) {
				head = head.next;
				return true;
			}
			while (temp.next != null) {
				if (temp.value == value) {
					temp.next = temp.next.next;
					return true;
				}
				temp = temp.next;
			}
		}
		return false;

	}

	public Node getHead() {
		return head;
	}
}
