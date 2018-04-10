package com.dhiva.StackAndQueues;

public class QueueImpl<T> {
	QueueNode<T> front;
	QueueNode<T> end;

	public QueueImpl() {
		front = null;
		end = null;
	}

	public void add(T item) {
		QueueNode<T> curr = new QueueNode<T>(item);

		if (front == null) {
			front = curr;
			end = curr;
		}
		end.next = curr;
		end = curr;
	}

	public T remove() {
		if (front == null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		T curr = front.data;
		front = front.next;
		return curr;

	}

	public T peek() {
		if (front == null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return front.data;
	}

	public boolean isEmpty() {
		if (front == null && end == null)
			return true;
		return false;
	}
}
