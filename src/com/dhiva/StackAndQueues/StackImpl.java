package com.dhiva.StackAndQueues;

public class StackImpl<T> {
	StackNode<T> top;

	public StackImpl() {
		top = null;
	}

	public T pop() {
		if (top != null) {
			T ret = top.data;
			top = top.next;
			return ret;
		}
		else
			throw new ArrayIndexOutOfBoundsException();
		
	}

	public void push(T element) {
		StackNode<T> temp = new StackNode<T>(element);
		temp.next = top;
		top = temp;
	}

	public T peek() {
		if (top != null) {
			return top.data;
		}
		else
			throw new ArrayIndexOutOfBoundsException();
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}
}
