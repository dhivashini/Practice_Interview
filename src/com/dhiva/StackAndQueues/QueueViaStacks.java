package com.dhiva.StackAndQueues;

import java.util.Stack;

public class QueueViaStacks {
	Stack<Integer> oldStack = new Stack<>();
	Stack<Integer> newStack = new Stack<>();

	public void add(int element) {
		newStack.push(element);
	}

	public int remove() {
		shuffleStacks();
		return oldStack.pop();
	}

	public int peek() {
		shuffleStacks();
		return oldStack.peek();
	}

	private void shuffleStacks() {
		if (!oldStack.isEmpty())
			while (!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}
	}

	public boolean isEmpty() {
		if (newStack.isEmpty() && oldStack.isEmpty())
			return true;
		return false;
	}
	
	public int size() {
		return newStack.size() + oldStack.size();
	}

}
