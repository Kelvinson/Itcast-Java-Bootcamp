package day16;

import java.util.LinkedList;

public class Queue {
	private LinkedList list = new LinkedList();
	
	// in stack
	public void in(Object obj) {
		list.addLast(obj);
	}
	
	// out stack
	public Object out() {
		return list.removeFirst();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
