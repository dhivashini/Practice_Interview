package com.dhiva.linkedlist;

public class Node {
	public Node next;
	public int value;
	
	public Node() {
		this.value = 0;
		this.next = null;
	}
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	public Node(int value, Node temp) {
		this.value = value;
		this.next = temp;
	}
}
