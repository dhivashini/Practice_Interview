package com.dhiva.StackAndQueues;

public class StackNode<T> {
	T data;
	StackNode<T> next;

	StackNode(T data) {
		this.data = data;
		this.next = null;
	}
}
