package com.dhiva.StackAndQueues;

public class MinStack {
	MinStackNode min;
	MinStackNode top;

	public MinStack() {
		top = null;
		min = null;
	}

	public int pop() {
		if (top != null) {
			int ret = top.data;
			if (ret == min.data) {
				min = min.next;
			}
			top = top.next;
			return ret;
		} else
			throw new ArrayIndexOutOfBoundsException();

	}

	public int min() {
		if (min != null)
			return min.data;
		else
			return -1;
	}

	public void push(int element) {
		if (min != null) {
			if (element < min.data) {
				MinStackNode minTemp = new MinStackNode(element);
				minTemp.next = min;
				min = minTemp;
			}
		} 
		else
			min = new MinStackNode(element);
		
		MinStackNode temp = new MinStackNode(element);
		temp.next = top;
		top = temp;

	}

	public int peek() {
		if (top != null) {
			return top.data;
		} else
			throw new ArrayIndexOutOfBoundsException();
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}
}
